/**
 * ��Ŀ����: FansChineseChess
 * �汾�ţ�1.0
 * ���֣�����
 * ����: http://FansUnion.cn
 * ����: FansUnion@qq.com
 * QQ��240-370-818
 * ��Ȩ:ͨ��Email��QQ������֪ͨ�Һ���ӵ��һ��Ȩ���������޸�-���·����ȡ� 
 * 
 */
package cn.fansunion.chinesechess.util;

import java.io.Serializable;

/**
 * ��Ϣ�࣬��װ��Ϣ��Ϣ
 * @author FansUnion@qq.com,http://FansUnion.cn,
 *         http://blog.csdn.net/FansUnion
 *
 */
public class Message implements Serializable{
	
	private static final long serialVersionUID = 124L;

	private String content;

	private String date;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}
