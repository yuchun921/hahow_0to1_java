package codegym;

public class HomeWork {

	public static void main(String[] args) {
		String json = "[{\"animal_id\":\"10305240201056\",\"animal_sex\":\"F\",\"animal_kind\":\"貓\",\"shelter_name\":\"台北動物之家\"},"
				+ "{\"animal_id\":\"10508011005002\",\"animal_sex\":\"F\",\"animal_kind\":\"狗\",\"shelter_name\":\"台中流浪動物醫院\"}]";

		System.out.println("Origin data" + json);
		// 將原有資料的 "[" "]" 去除
		json = json.replace("[", "").replace("]", "");

		// 用substring分別取出 cat 和 dog 的資料存入String cat 和 String dog
		String catData = json.substring(0, json.indexOf(",{")).replace("{", "").replace("}", "");
//		String dogData = json.substring(json.indexOf(",{"), json.lastIndexOf("}")).replace(",{", "");
		String dogData = json.replace(catData + "},", "").replace("{", "").replace("}", "");
		System.out.println(catData);
		System.out.println(dogData);

		// 用split各自將catData和dogData的字串依照","分開存到陣列
		String[] cat = catData.split(",");
		String[] dog = dogData.split(",");

		// Print 出 cat[0]的資料 ==> animal_id
		System.out.println(cat[0]);
		System.out.println(dog[0]);
	}

}
