package koreait.ext;

import java.util.UUID;

public class UUIDTest {

	public static void main(String[] args) {

		String uuid;
		uuid = UUID.randomUUID().toString();
		//16���� 32�ڸ� + ������ ��ȣ 4���� ��������� �������ڿ�
		for(int i=0;i<10;i++) {
			uuid = UUID.randomUUID().toString();
			System.out.println(uuid);
		}	
		for(int i =0;i<10;i++) {
			uuid = UUID.randomUUID().toString();
			System.out.println(uuid.replace("-", ""));
		}
		
		for(int i =0;i<10;i++) {
			uuid = UUID.randomUUID().toString();
			System.out.println(uuid.replace("-", "").substring(0, 12));
		}
	
		/* 
		 * git ��ū�� : ��ū���� 
		 * ������Ʈ���� ȸ�����Խ� ��й�ȣ�� �����Ѵ�.(�н����� ����) ��й�ȣ�� �������� ������ �ɱ��?
		 * -> �ؽ� (��ȣȭ�� �ȵǴ� �Լ�) �Լ��� �̿��ؼ� ���ڿ��� ���� �ĺ����� ������ �����Ѵ�.
		 * -> ��й�ȣ 1234 �� ���� �ؽ��Լ� ���� ����. �α���1234
		 * -> ��ǥ���� �ؽ��Լ� sha256 �˰��� (�ڹٿ��� �������� MessageDigest Ŭ���� ���)
		 * 
		 * ��ȭȭ : �� -> ��ȣ��, ��ȣȭ : ��ȣ�� -> ��		(����Ű�� ����Ű�� �̿�)
		 */
	
	}
}
