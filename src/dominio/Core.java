package dominio;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Core {

	static IUserRepository userRepository;
	static ClassPathXmlApplicationContext applicationContext;

	public static void main(String[] args) {
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		userRepository = (IUserRepository) applicationContext.getBean("userRepositoryBean");

		System.out.println(userRepository.getUsers().size());

		userRepository.getUsers().add((User) applicationContext.getBean("userBean"));
		userRepository.getUsers().add((User) applicationContext.getBean("userBean"));

		userRepository.getUsers().get(1).setNickname("nuevo");

		System.out.println(userRepository.getUsers().size());
		System.out.println(userRepository.getUsers().toString());

		System.out.println(userRepository.getUsers().get(1).getNickname());
		System.out.println(userRepository.getUsers().get(0).getNickname());

	}

}
