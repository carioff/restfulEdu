package kr.re.kitri.park;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@SpringBootApplication
public class ParkApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkApplication.class, args);
	}
	
	/**
	 * xml대신 주입 
	 * @param ds
	 * @return
	 * @throws Exception
	 */
	@Bean 
	public SqlSessionFactory sqlSessionFactory(DataSource ds) throws Exception { 
		final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean(); // 데이터소스 설정     
		sessionFactory.setDataSource(ds); // XML 매퍼 파일 경로 설정     
		sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mappers/*-mapper.xml"));
		return sessionFactory.getObject(); 
		
	}

	/**
	 * 일종의 Decorator 패턴 
	 * @param sessionFactory
	 * @return
	 */
	@Bean
	public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sessionFactory) {
		return new SqlSessionTemplate(sessionFactory);
	}
}
