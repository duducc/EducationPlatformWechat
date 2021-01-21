package com.saint.pub;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.*;

public class NetUtil {

	public static String getLocalHostIP() {
		String ip;
		try {
			InetAddress addr = InetAddress.getLocalHost();
			ip = addr.getHostAddress();
		} catch (Exception ex) {
			ip = "";
		}
		return ip;
	}

	public static String getLocalHostName() {
		String hostName;
		try {
			InetAddress addr = InetAddress.getLocalHost();
			hostName = addr.getHostName();
		} catch (Exception ex) {
			hostName = "";
		}
		return hostName;
	}

	@SuppressWarnings("unchecked")
	public static String getLocalFiltedIP(String ipStr) {
		String reuslt = "";
		List list = new ArrayList();
		String localIP[] = getAllLocalHostIP();
		if (ipStr == null || ipStr.equals(""))
			ipStr = "";
		for (int i = 0; i < localIP.length; i++) {
			String ip = localIP[i];
			//&& (ip.substring(0, 2).equals("10") || ip.substring(0, 3).equals("192"))
			if (ipStr.indexOf(ip) > -1)
				list.add(ip);
		}
		if (list.size() > 0)
			reuslt = (String) list.get(0);
		return reuslt;
	}

	public static String getAllLocalHostIPStr() {
		String localIP[] = getAllLocalHostIP();
		StringBuffer buffer = new StringBuffer();
		buffer.append("<!--AllLocalHostIP:");
		for (int i = 0; i < localIP.length; i++) {
			String ip = localIP[i];
			buffer.append(ip);
			buffer.append(";");
		}

		buffer.append("-->");
		return buffer.toString();
	}

	public static String[] getAllLocalHostIP() {
		return getAllIP();
	}

	public static String[] getAllHostIPByName(String hostName) {
		String ret[] = (String[]) null;
		try {
			if (hostName.length() > 0) {
				InetAddress addrs[] = InetAddress.getAllByName(hostName);
				if (addrs.length > 0) {
					ret = new String[addrs.length];
					for (int i = 0; i < addrs.length; i++)
						ret[i] = addrs[i].getHostAddress();

				}
			}
		} catch (Exception ex) {
			ret = (String[]) null;
		}
		return ret;
	}

	public static String transSSL(String in) {
		if (in == null || in.equals(""))
			return "";
		StringBuffer sb = new StringBuffer();
		String a[] = in.split(";");
		for (int i = 0; i < a.length; i++) {
			String b[] = a[i].split(":");
			if (b.length >= 3) {
				sb.append(b[0]);
				sb.append(":");
				sb.append(b[2]);
				sb.append(":");
				sb.append(b[1]);
				sb.append(";");
			}
		}

		return sb.toString();
	}

	public static String[] getAllIP() {
		String tmp[] = new String[64];
		String ret[] = (String[]) null;
		int i = 0;
		try {
			Enumeration netInterfaces = NetworkInterface.getNetworkInterfaces();
			InetAddress ip = null;
			while (netInterfaces.hasMoreElements()) {
				NetworkInterface ni = (NetworkInterface) netInterfaces
						.nextElement();
				for (Enumeration address = ni.getInetAddresses(); address
						.hasMoreElements();)
					if (i < 128) {
						ip = (InetAddress) address.nextElement();
						tmp[i] = ip.getHostAddress();
						i++;
					}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		ret = new String[i];
		for (int j = 0; j < i; j++)
			ret[j] = tmp[j];

		return ret;
	}

	public static void main(String args[]) {
		String fzjh = "192.168.1.211";
		String r = getLocalFiltedIP(fzjh);
		System.out.print(r);
	}
}
