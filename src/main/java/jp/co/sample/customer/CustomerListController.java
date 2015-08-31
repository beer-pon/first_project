package jp.co.sample.customer;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.io.Reader;
import java.util.List;

import jp.co.sample.customer.biz.model.Customer;
import jp.co.sample.customer.biz.model.Rank;
import jp.co.sample.customer.biz.service.CustomerService;
import jp.co.sample.customer.biz.service.DataNotFoundException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerListController {
	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = "/customer", method = GET)
	public String showAllCustomer(Model model) throws Exception {
		List<Customer> customers = customerService.findAll();
		model.addAttribute("customers", customers);
		String resource = "/mybatis.xml";
		Reader reader = Resources.getResourceAsReader(resource);
		SqlSessionFactory sqlFactory = new SqlSessionFactoryBuilder()
				.build(reader);
		SqlSession session = sqlFactory.openSession();
		List<Rank> ranks = session.selectList("jp.co.sample.customer.biz.model.RankMapper.selectByExample");
		for(Rank rank :ranks){
			System.out.println(rank.getId());
			System.out.println(rank.getName());
		}
		return "customer/list";
	}

	@RequestMapping(value = "/", method = GET)
	public String home() {
		return "forward:/customer";
	}

	@RequestMapping(value = "/customer/{customerId}", method = GET)
	public String showCustomerDetail(@PathVariable int customerId, Model model)
			throws DataNotFoundException {
		Customer customer = customerService.findById(customerId);
		model.addAttribute("customer", customer);
		return "customer/detail";
	}

}
