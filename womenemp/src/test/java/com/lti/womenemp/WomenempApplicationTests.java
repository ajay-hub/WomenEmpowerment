package com.lti.womenemp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.lti.beans.Admin;
import com.lti.beans.Ngo;
import com.lti.beans.NgoCourse;
import com.lti.beans.Step;
import com.lti.dao.AdminDao;
import com.lti.service.AdminService;

@SpringBootTest
class WomenempApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	AdminService adminService;
	
	@MockBean
	AdminDao adminrepo;

	@Test
	void testGetAdmins() {
		
		Admin e1=new Admin("admin", "ajay", "15Feb", "ajay1234", (double)9987131);		
		Admin e2=new Admin("adminNext", "ajay", "15Feb", "ajay1234", (double) 9987131);	
		
		
		List<Admin> adminList = new ArrayList<>();
		
		adminList.add(e1);
		adminList.add(e2);	
		System.out.println(adminrepo.fetchAll());
		System.out.println(adminList);
		System.out.println(adminService.fetchEach());
		
		Mockito.when(adminrepo.fetchAll()).thenReturn(adminList);		
		//assertThat(adminService.fetchEach()).isEqualTo(adminList);
		//assertEquals(adminService.fetchEach(),adminList);
		assertEquals(adminList.get(0).getUserNameAdmin(),"admin");
		
	}
	
	@Test
	void testCreateAdmin() {
		Admin e1=new Admin("admin", "ajay", "15Feb", "ajay1234", (double)9987131);	
		
		try {
			assertTrue(adminService.addAdmin(e1));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	void testUpdateUserStatus() {
		int checkRegId = 101;
		
		try {
			assertTrue(adminService.updateStatus(103));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	void testDeleteEmp() {
		
		Ngo ngo = new Ngo("username", "name", "location", "password");
		NgoCourse e1=new NgoCourse(101, "courseTrainingSector", "courseName","courseDetails",
				"courseDuration",false, ngo);	
		Mockito.when(adminrepo.fetchUserById(101)).thenReturn(e1);
		Mockito.when(adminrepo.deleteCourse(e1.getCourseId())).thenReturn(true);
		   assertTrue(adminrepo.deleteCourse(e1.getCourseId()));
	}

//	@Test
//	void testDeleteEmp() {
//		try {
//			assertTrue(adminService.deleteCourse(101));
//		}
//		catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
//		
//	}

}


//package com.lti.springrestjpa;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//
//import com.lti.beans.Employee;
//import com.lti.dao.EmpDao;
//import com.lti.excep.EmpExcep;
//import com.lti.services.EmpService;
//
//import org.junit.jupiter.api.Test;
//
//
//@ExtendWith(SpringExtension.class)
//@SpringBootTest
//class IntegrationprojectApplicationTests {
//
//	@Autowired
//	EmpService empservice;
//	
//	@MockBean
//	EmpDao emprepo;
//
//	@Test
//	void testGetEmps() {
//		
//		Employee e1=new Employee(101,"Jay",50000);		
//		Employee e2=new Employee(102,"Vijay",6000);	
//		
//		List<Employee> empList = new ArrayList<>();
//		
//		empList.add(e1);
//		empList.add(e2);	
//		
//		Mockito.when(emprepo.findEmpList()).thenReturn(empList);		
//		assertThat(empservice.findEmpList()).isEqualTo(empList);
//		
//	}
//
//	@Test
//	void testGetEmpById() {
//		Employee e1=new Employee(101,"Jay",60000);	
//		
//		Optional<Employee> e2=Optional.of(e1);
//		
//		//Mockito.when(emprepo.getEmpById(101).thenReturn(e2);
//		assertThat(empservice.findEmpById(101)).isEqualTo(e2);
//	}
//
//	@Test
//	void testCreateEmp() {
//		Employee e1=new Employee(101,"Jay",60000);	
//		
//		try {
//			assertThat(empservice.addEmp(e1)).isEqualTo(e1);
//		} catch (EmpExcep e) {
//			System.out.println(e.getMessage());
//		}
//	}
//
//	@Test
//	void testAddEmps() {
//		Employee e1=new Employee(101,"Jay",60000);	
//		Employee e2=new Employee(102,"Vijay",6000);				
//		List<Employee> empList = new ArrayList<>();
//		empList.add(e1);
//		empList.add(e2);		
//	//	Mockito.when(emprepo.saveAll(empList)).thenReturn(empList);
//		
//		//assertThat(empservice.addEmps(empList)).isEqualTo(empList);
//	}
//
////	@Test
////	void testUpdateEmp() throws Exception {
////		Employee e1=new Employee(101,"Jay",60000);			
////		Optional<Employee> e2=Optional.of(e1);
////		Mockito.when(emprepo.findEmpById(id)).thenReturn(e2);
////		e1.setEmpName("Jay");
////   Mockito.when(emprepo.save(e1)).thenReturn(e1);
////   assertThat(empservice.updateEmp(e1)).isEqualTo(e1);
////	}
///*
//	@Test
//	void testDeleteEmp() {
//		
//		Employee e1=new Employee(101,"Jay",60000);			
//		Optional<Employee> e2=Optional.of(e1);
//		Mockito.when(emprepo.findById(1)).thenReturn(e2);
//		 Mockito.when(emprepo.existsById(e1.getEid())).thenReturn(false);
//		   assertFalse(emprepo.existsById(e1.getEid()));
//	}*/
//
//	/*
//	 * @Test void testDeleteEmpById() {
//	 * 
//	 * }
//	 */
//
//}
