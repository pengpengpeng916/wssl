/**
 * Copyright (c) 2012, ������Ϣ�ɷ����޹�˾
 * All rights reserved.
 * 
 * �ļ����ƣ�Md5.java
 * ժ   Ҫ��
 * ��   ����
 * ��   �ߣ����ӳ�
 * �������ڣ�2012-3-15
 */
package com.fjaisino.application.common.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5 {
	public static byte[] messageDigest(byte[] message)
			throws NoSuchAlgorithmException {

		byte[] digest = null;

		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(message);
		digest = md.digest();

		return digest;
	}

	/**
	 * ����16����
	 * 
	 * @param message
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	public static String digest2HEX(byte[] message)
			throws NoSuchAlgorithmException {
		byte[] digest = null;
		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(message);
		digest = md.digest();
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < digest.length; i++) {
			result.append(Integer.toHexString(
					(0x000000ff & digest[i]) | 0xffffff00).substring(6));
		}
		return result.toString();
	}

	public static String messageDigestConvertToString(String messageSrc)
			throws UnsupportedEncodingException, NoSuchAlgorithmException {
		if (messageSrc == null) {
			return null;
		}
		byte[] message = messageSrc.getBytes("UTF-8");
		byte[] md = messageDigest(message);
		String mdResult = new String(Base64Encoder.encode(md));
		return mdResult;
	}

}
