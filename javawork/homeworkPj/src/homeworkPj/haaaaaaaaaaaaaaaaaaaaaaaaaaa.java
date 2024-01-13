package homeworkPj;

public class haaaaaaaaaaaaaaaaaaaaaaaaaaa {

	public static void main(String[] args) {
		String[] name = { "장동건", "장남건", "장서건", "장중건", "북두신건" };

		int[] kor = { 87, 67, 97, 77, 57 };
		int[] eng = { 86, 68, 97, 77, 57 };
		int[] mat = { 86, 69, 97, 77, 57 };
		int[] num = { 0, 1, 2, 3, 4 };
		int[] sum = new int[num.length];
		int[] av = new int[num.length];
		String[] gr = new String[av.length];
		for (int i = 0; i < num.length; i++) {
			sum[i] = kor[i] + mat[i] + eng[i];
			av[i] = sum[i] / 3;
		}
		for (int i = 0; i < kor.length; i++) {
			if (av[i] >= 90) {
				gr[i] = "수";
			} else if (av[i] >= 80) {
				gr[i] = "우";
			} else if (av[i] >= 70) {
				gr[i] = "미";
			} else if (av[i] >= 60) {
				gr[i] = "양";
			} else {
				gr[i] = "가";
			}
		}
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t등급");//// 번호 이름 국어 영어 수학 총점 평균 등급
		System.out.println("----------------------------------------------------------");

		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t" + name[i] + "\t" + kor[i] + "\t" + eng[i] + "\t" + mat[i] + "\t" + sum[i]
					+ "\t" + av[i] + "\t" + gr[i] + "\n");// 번호 이름 국어 영어 수학 총점 평균 등급
		}

	}

}
