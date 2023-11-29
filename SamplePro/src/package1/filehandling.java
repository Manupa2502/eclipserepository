package package1;

import java.io.File;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class filehandling {
	void copy_file() {
		try {
			File srcf = new File("C:\\Users\\SVYOVW744\\Desktop\\javausage.txt");
			File desf = new File("C:\\Users\\SVYOVW744\\Desktop\\javausage2.txt");
			FileUtils.copyFile(srcf, desf);
			File dir_desf = new File("C:\\Users\\SVYOVW744\\Desktop\\java\\");
			FileUtils.copyFileToDirectory(srcf, dir_desf);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	void rename_file() {
		try {
			File mdesf = new File("C:\\Users\\SVYOVW744\\Desktop\\java\\javausage3.txt");
			File srcf = new File("C:\\Users\\SVYOVW744\\Desktop\\javausage2.txt");
			FileUtils.moveFile(srcf, mdesf);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	void read_file() {
		try {
			File f = new File("C:\\Users\\SVYOVW744\\Desktop\\javausage.txt");
			String x = FileUtils.readFileToString(f, "UTF-8");
			System.out.println(x);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	void write_file() {
		try {
			File f1 = new File("C:\\Users\\SVYOVW744\\Desktop\\javausage.txt");
			FileUtils.writeStringToFile(f1, "\nmanu written at the end", "UTF-8", true);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	void sort_data() {
		try {
			File f1 = new File("C:\\Users\\SVYOVW744\\Desktop\\javausage.txt");
			List<String> list = FileUtils.readLines(f1, "UTF-8");
			Collections.sort(list);
			FileUtils.write(f1, " ", "UTF-8", false);
			for (String x : list) {
				FileUtils.write(f1, x + "\n", "UTF-8", true);
				// System.out.println(x);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		filehandling fh = new filehandling();
		fh.read_file();
		System.out.println("-------------------");
		fh.write_file();
		System.out.println("-------------------");
		fh.read_file();
		System.out.println("-------------------");
		fh.sort_data();
		System.out.println("-------------------");
		fh.read_file();
		System.out.println("-------------------");
		fh.copy_file();
		System.out.println("-------------------");
		fh.rename_file();

	}

}
