package com.fjaisino.application.common.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class Base64Encoder {
	static public char[] encode(byte[] data) {
		char[] out = new char[((data.length + 2) / 3) * 4];

		for (int i = 0, index = 0; i < data.length; i += 3, index += 4) {
			boolean quad = false;
			boolean trip = false;

			int val = (0xFF & (int) data[i]);
			val <<= 8;
			if ((i + 1) < data.length) {
				val |= (0xFF & (int) data[i + 1]);
				trip = true;
			}
			val <<= 8;
			if ((i + 2) < data.length) {
				val |= (0xFF & (int) data[i + 2]);
				quad = true;
			}
			out[index + 3] = base64EncodeChars[(quad ? (val & 0x3F) : 64)];
			val >>= 6;
			out[index + 2] = base64EncodeChars[(trip ? (val & 0x3F) : 64)];
			val >>= 6;
			out[index + 1] = base64EncodeChars[val & 0x3F];
			val >>= 6;
			out[index + 0] = base64EncodeChars[val & 0x3F];
		}
		return out;
	}

	static public byte[] decode(char[] data) {
		int tempLen = data.length;
		for (int ix = 0; ix < data.length; ix++) {
			if ((data[ix] > 255) || base64DecodeChars[data[ix]] < 0)
				--tempLen; // ignore non-valid chars and padding
		}
		int len = (tempLen / 4) * 3;
		if ((tempLen % 4) == 3)
			len += 2;
		if ((tempLen % 4) == 2)
			len += 1;

		byte[] out = new byte[len];

		int shift = 0;
		int accum = 0;
		int index = 0;

		for (int ix = 0; ix < data.length; ix++) {
			int value = (data[ix] > 255) ? -1 : base64DecodeChars[data[ix]];

			if (value >= 0) {
				accum <<= 6;
				shift += 6;
				accum |= value;
				if (shift >= 8) {
					shift -= 8;
					out[index++] = (byte) ((accum >> shift) & 0xff);
				}
			}

		}

		if (index != out.length) {
			throw new Error("Miscalculated data length (wrote " + index
					+ " instead of " + out.length + ")");
		}

		return out;
	}

	public static String encodeString(String str) {
		byte[] bt = str.getBytes();
		char[] cArray = Base64Encoder.encode(bt);
		return new String(cArray);
	}

	public static String decodeString(String str) {
		char[] cArray = str.toCharArray();
		byte[] bt = Base64Encoder.decode(cArray);
		return (new String(bt));
	}

	static private char[] base64EncodeChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/="
			.toCharArray();

	private static byte[] base64DecodeChars = new byte[] { -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59,
			60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
			10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1,
			-1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37,
			38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1,
			-1, -1 };

	public static void main(String[] args) {
		boolean decode = false;

		if (args.length == 0) {
			System.out.println("usage: java Base64 [-d[ecode]] filename");
			System.exit(0);
		}
		for (int i = 0; i < args.length; i++) {
			if ("-decode".equalsIgnoreCase(args[i]))
				decode = true;
			else if ("-d".equalsIgnoreCase(args[i]))
				decode = true;
		}

		String filename = args[args.length - 1];
		File file = new File(filename);
		if (!file.exists()) {
			System.out.println("Error: file '" + filename + "' doesn't exist!");
			System.exit(0);
		}

		if (decode) {
			char[] encoded = readChars(file);
			byte[] decoded = decode(encoded);
			writeBytes(file, decoded);
		} else {
			byte[] decoded = readBytes(file);
			char[] encoded = encode(decoded);
			writeChars(file, encoded);
		}
	}

	private static byte[] readBytes(File file) {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			InputStream fis = new FileInputStream(file);
			InputStream is = new BufferedInputStream(fis);
			int count = 0;
			byte[] buf = new byte[16384];
			while ((count = is.read(buf)) != -1) {
				if (count > 0)
					baos.write(buf, 0, count);
			}
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return baos.toByteArray();
	}

	private static char[] readChars(File file) {
		CharArrayWriter caw = new CharArrayWriter();
		try {
			Reader fr = new FileReader(file);
			Reader in = new BufferedReader(fr);
			int count = 0;
			char[] buf = new char[16384];
			while ((count = in.read(buf)) != -1) {
				if (count > 0)
					caw.write(buf, 0, count);
			}
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return caw.toCharArray();
	}

	private static void writeBytes(File file, byte[] data) {
		try {
			OutputStream fos = new FileOutputStream(file);
			OutputStream os = new BufferedOutputStream(fos);
			os.write(data);
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void writeChars(File file, char[] data) {
		try {
			Writer fos = new FileWriter(file);
			Writer os = new BufferedWriter(fos);
			os.write(data);
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
