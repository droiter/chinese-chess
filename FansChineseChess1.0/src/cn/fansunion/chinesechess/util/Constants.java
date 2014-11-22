/**
 * 项目名称: FansChineseChess
 * 版本号：1.0
 * 名字：雷文
 * 官网: http://FansUnion.cn
 * 邮箱: FansUnion@qq.com
 * QQ：240-370-818
 * 版权:通过Email和QQ等渠道通知我后，则拥有一切权力，包括修改-重新发布等。 
 * 
 */
package cn.fansunion.chinesechess.util;

import java.awt.Color;
/**
 * 
 * @author FansUnion@qq.com,http://FansUnion.cn,
 *         http://blog.csdn.net/FansUnion
 *
 */
public interface Constants {

	public static final String RED_NAME ="红方";
	
	public static final String BLUE_NAME ="蓝方";
	
	public static int PLAYER1 = 1; 

	public static int PLAYER2 = 2;

	public static int PLAYER1_WON = 1; 

	public static int PLAYER2_WON = 2; 

	public static int RUNNING= 3; 

	public static int CONTINUE = 4; 
	
	public static int GAME_EXIT = 0;
	
	public static int GAME_START = 6;
	
	public static int GAME_PAUSE = 7;
	
	public static int MOVING = 8;
	
	public static int GAME_BACK = 9;
	
	public static String SPACE = "    ";
	
	public static int PORT = 12345;
	
	public static int PLAYER2_ENTER = 158;
	
	public static int GIVEIN = 159;
	
	public static int MESSAGE = 201;
	
	public static int  PIECE_WIDTH = 45;
	
	public static int PIECE_HEIGHT = 45;
	
	public static Color bc = new Color(204, 153, 102);
}
