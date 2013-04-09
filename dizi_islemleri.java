import java.util.Arrays;
import javax.swing.*;

public class Dizi_Islemleri {

  /**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] dizi;
		dizi = new int[10];
		int i = 0;
		
		for (i = 0; i < 10; i++) {
			int eleman = Integer.parseInt(JOptionPane.showInputDialog(null, i+1+". Sayı :", "Sayı Girişi", 1));
			dizi[i] = eleman;
		}
		 
		JOptionPane.showMessageDialog(null, "Büyükten küçüğe sıralı dizi: " +  Arrays.toString(buyukSirala(dizi)));
		JOptionPane.showMessageDialog(null, "Küçükten büyüğe sıralı dizi: " +  Arrays.toString(kucukSirala(dizi)));
		JOptionPane.showMessageDialog(null, "Dizinin en büyük elemanı: " +  buyukEleman(dizi));
		JOptionPane.showMessageDialog(null, "Dizinin en küçük elemanı: " +  kucukEleman(dizi));
		JOptionPane.showMessageDialog(null, "Dizinin ortalama değeri: " +  ortalama(dizi));
	}
	public static int ortalama (int[] dizi) {
		int ort = 0;
		int toplam = 0;
		int i = 0;
		
		for (i = 0; i < dizi.length; i++) {
			toplam = toplam + dizi[i];
			ort = toplam / dizi.length; 
		}
		return ort;
	}
	public static int[] kucukSirala (int[] dizi) {
		int[] siraliDizi;
		siraliDizi = dizi;
		int i, j = 0;
		
		for (i = 0; i < dizi.length; i ++) {
			for (j = 0; j < dizi.length -1; j ++) {
				if(siraliDizi[j] >= siraliDizi[j + 1]) {
					int temp = siraliDizi[j + 1];
					siraliDizi[j + 1] = siraliDizi[j];
					siraliDizi[j] = temp;
				}
			}
		}
		return siraliDizi;
	}
	public static int[] buyukSirala (int[] dizi) {
		int[] siraliDizi;
		siraliDizi = new int[10];
		int i = 0;
		int temp = 0;
		
		for(i = 0; i < dizi.length / 2; i++) {
			temp = dizi[i];
            dizi[i] = dizi[dizi.length - i - 1];
            dizi[dizi.length - i - 1] = temp;
		}
		siraliDizi = dizi;
		return siraliDizi;
	}
	public static int buyukEleman (int[] dizi) {
		return buyukSirala(dizi)[0];
	}
	public static int kucukEleman (int[] dizi) {
		return kucukSirala(dizi)[0];
	}
}
