package INF380;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {
	
	
	public static void main(String[] args) throws IOException {
		
		District district = new District();
		
		List<Home> home = new ArrayList<Home>();
		
		Home home1 = new Home(); 
		PolitiqueA p = home1.getPoli();
		//p.haha();
		
		Initialize ini = new Initialize();
		
		//TO DO: �����ļ����½�home, ��home��ֵ����ӵ�List�У����õ�District
		
		int size = home.size();//size of home
		int sizeP = home.get(0).getP().size();//size of production(���������е����)
		
		for(int i=0; i<size; i++){
			List<Integer> stock = home.get(i).getStockplus();
		    district.addP(stock);
		}
		//�ռ����е�production
		
		//TO DO: ����
		
		//TO DO: �������
		
	}

}
