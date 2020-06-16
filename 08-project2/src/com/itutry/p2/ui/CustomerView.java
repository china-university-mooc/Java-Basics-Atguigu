package com.itutry.p2.ui;

import com.itutry.p2.bean.Customer;
import com.itutry.p2.service.CustomerService;
import com.itutry.p2.util.CMUtility;

public class CustomerView {

	private CustomerService customerService = new CustomerService(10);

	public void showMainMemu() {

		boolean quit = false;
		while (!quit) {
			System.out.println("-----------------客户信息管理软件-----------------\n");
			System.out.println("                   1 添加客户");
			System.out.println("                   2 修改客户");
			System.out.println("                   3 删除客户");
			System.out.println("                   4 客户列表");
			System.out.println("                   5 退   出\n");
			System.out.println("                   请选择(1-5):");

			char selection = CMUtility.readMenuSelection();
			switch (selection) {
			case '1':
				addCustomer();
				break;
			case '2':
				modifyCustomer();
				break;
			case '3':
				deleteCustomer();
				break;
			case '4':
				showAllCustomers();
				break;
			case '5':
				System.out.println("确认是否退出(Y/N):");
				char confirm = CMUtility.readConfirmSelection();
				if (confirm == 'Y') {
					quit = true;
				}
			}
		}
	}

	public void addCustomer() {
		System.out.println("---------------------添加客户---------------------");
		System.out.println("姓名：");
		String name = CMUtility.readString(10);
		System.out.println("性别：");
		char gender = CMUtility.readChar();
		System.out.println("年龄：");
		int age = CMUtility.readInt();
		System.out.println("电话：");
		String phone = CMUtility.readString(12);
		System.out.println("邮箱：");
		String email = CMUtility.readString(50);
		Customer customer = new Customer(name, gender, age, phone, email);
		boolean result = customerService.addCustomer(customer);
		if (result) {
			System.out.println("---------------------添加完成---------------------");
		} else {
			System.out.println("---------------------添加失败---------------------");
		}
	}

	public void modifyCustomer() {
		System.out.println("---------------------修改客户---------------------");

		int index;
		Customer customer;
		while (true) {
			System.out.println("请选择待修改用户编号(-1退出)：");
			int number = CMUtility.readInt();
			if (number == -1) {
				return;
			}

			index = number - 1;
			customer = customerService.getCustomer(index);
			if (customer != null) {
				break;
			}
		}

		System.out.println("姓名(" + customer.getName() + ")：");
		String name = CMUtility.readString(10, customer.getName());
		System.out.println("性别(" + customer.getGender() + ")：");
		char gender = CMUtility.readChar(customer.getGender());
		System.out.println("年龄(" + customer.getAge() + ")：");
		int age = CMUtility.readInt(customer.getAge());
		System.out.println("电话(" + customer.getPhone() + ")：");
		String phone = CMUtility.readString(12, customer.getPhone());
		System.out.println("邮箱(" + customer.getEmail() + ")：");
		String email = CMUtility.readString(50, customer.getEmail());

		Customer newCustomer = new Customer(name, gender, age, phone, email);
		boolean result = customerService.replaceCustomer(index, newCustomer);
		if (result) {
			System.out.println("---------------------修改完成---------------------");
		} else {
			System.out.println("---------------------修改失败---------------------");
		}
	}

	public void deleteCustomer() {
		System.out.println("---------------------删除客户---------------------");

		int index;
		Customer customer;
		while (true) {
			System.out.println("请选择待修改用户编号(-1退出)：");
			int number = CMUtility.readInt();
			if (number == -1) {
				return;
			}

			index = number - 1;
			customer = customerService.getCustomer(index);
			if (customer != null) {
				break;
			}
		}
		
		System.out.println("确认是否删除(Y/N)：");
		char confirm = CMUtility.readConfirmSelection();
		if (confirm == 'Y') {
			boolean result = customerService.deleteCustomer(index);
			if (result) {
				System.out.println("---------------------删除完成---------------------");
			} else {
				System.out.println("---------------------删除失败---------------------");
			}
		}
	}

	public void showAllCustomers() {
		System.out.println("---------------------------客户列表---------------------------");
		if (customerService.getTotal() == 0) {
			System.out.println("暂时没有客户！");
		} else {
			System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
			Customer[] customers = customerService.getAllCustomers();
			for (int i = 0; i < customers.length; i++) {
				Customer customer = customers[i];
				System.out.println((i + 1) + "\t" + customer.getName() + "\t" + customer.getGender() + "\t"
						+ customer.getAge() + "\t" + customer.getPhone() + "\t" + customer.getEmail());
			}
		}
		System.out.println("--------------------------客户列表完成-------------------------");
	}

	public static void main(String[] args) {
		CustomerView customerView = new CustomerView();
		customerView.showMainMemu();
	}
}
