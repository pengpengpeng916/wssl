package com.fjaisino.application.common.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class GZIPUtils {

	public static void decompress(InputStream is, FileOutputStream fos) {
		try {
			GZIPInputStream gin = new GZIPInputStream(is);
			byte[] buffer = new byte[1024];
			int offset = -1;
			while ((offset = gin.read(buffer)) != -1) {
				fos.write(buffer, 0, offset);
			}
			fos.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static byte[] compress(String str) throws IOException {
		if (str == null || str.length() == 0) {
			return null;
		}
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		GZIPOutputStream gzip = new GZIPOutputStream(out);
		gzip.write(str.getBytes("GBK"));
//		gzip.write(str.getBytes("UTF-8"));
		gzip.close();
		return out.toByteArray();
	}

	/**
	 * GZIP��ʽ��ѹ
	 * 
	 * @param compressed
	 * @return
	 */
	public static String decompress(byte[] compressed) {
		if (compressed == null)
			return null;
		ByteArrayOutputStream out = null;
		ByteArrayInputStream in = null;
		GZIPInputStream zin = null;
		String decompressed;
		try {
			out = new ByteArrayOutputStream();
			in = new ByteArrayInputStream(compressed);
			zin = new GZIPInputStream(in);
			byte[] buffer = new byte[1024];
			int offset = -1;
			while ((offset = zin.read(buffer)) != -1) {
				out.write(buffer, 0, offset);
			}
			decompressed = out.toString("GBK");
		} catch (IOException e) {
			e.printStackTrace();
			decompressed = null;
		} finally {
			if (zin != null) {
				try {
					zin.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return decompressed;
	}

}
