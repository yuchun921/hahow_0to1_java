package codegym;

public class HomeWork {

	public static void main(String[] args) {
		String json = "[{\"animal_id\":\"10305240201056\",\"animal_sex\":\"F\",\"animal_kind\":\"��\",\"shelter_name\":\"�x�_�ʪ����a\"},"
				+ "{\"animal_id\":\"10508011005002\",\"animal_sex\":\"F\",\"animal_kind\":\"��\",\"shelter_name\":\"�x���y���ʪ���|\"}]";

		System.out.println("Origin data" + json);
		// �N�즳��ƪ� "[" "]" �h��
		json = json.replace("[", "").replace("]", "");

		// ��substring���O���X cat �M dog ����Ʀs�JString cat �M String dog
		String catData = json.substring(0, json.indexOf(",{")).replace("{", "").replace("}", "");
//		String dogData = json.substring(json.indexOf(",{"), json.lastIndexOf("}")).replace(",{", "");
		String dogData = json.replace(catData + "},", "").replace("{", "").replace("}", "");
		System.out.println(catData);
		System.out.println(dogData);

		// ��split�U�۱NcatData�MdogData���r��̷�","���}�s��}�C
		String[] cat = catData.split(",");
		String[] dog = dogData.split(",");

		// Print �X cat[0]����� ==> animal_id
		System.out.println(cat[0]);
		System.out.println(dog[0]);
	}

}
