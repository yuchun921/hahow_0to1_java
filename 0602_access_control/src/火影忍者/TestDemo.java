package 火影忍者;
import 海賊王.騙人布;
import 海賊王.鷹眼;
public class TestDemo {
	public static void main(String[] args) {
		
		/* Access control
		 * - private:
		 * 		同一個class
		 * - default:
		 * 		同一個class and package, 其他class可使用其屬性和方法
		 * - protected:
		 * 		基本上不能用於其他package
		 * 		但若其他package中的class有繼承protected的class的話, 就可以使用
		 * 		// 同一個class and package, 不同套件子類別
		 * - public:
		 * 		都可以使用
		 */
		
		因陀螺 son1 = new 因陀螺();
		阿修羅 son2 = new 阿修羅();
		騙人布 student1 = new 騙人布();
		
		System.out.println("因陀螺的技能: " + son1.skill);
		System.out.println("阿修羅的技能: " + son2.skill);
		System.out.println("騙人布的技能: " + student1.skill);
		
		// hw
		
		鳴人 friend = new 鳴人();
		鷹眼 student2 = new 鷹眼();
		System.out.println("鳴人的技能: " + friend.skill);
		System.out.println("鷹眼的技能: " + student2.skill);
		
	}
}
