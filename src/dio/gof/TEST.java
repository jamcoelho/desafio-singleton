package dio.gof;

public class TEST {

	public static void main(String[] args) {
		
		//Testes Relacionados ao Design Pattern Singleton
		SingletonLazy lazy =  SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy .getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager =  SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager .getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyholder =  SingletonLazyHolder.getInstancia();
		System.out.println(lazyholder);
		lazyholder = SingletonLazyHolder .getInstancia();
		System.out.println(lazyholder);

	}

}
