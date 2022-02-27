package CaseStudy.Models.Service;

import CaseStudy.Models.Models.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {

    private ArrayList<Employee> listEmployee;
    public static Scanner scanner = new Scanner(System.in);


    public EmployeeServiceImpl(){
        this.listEmployee = new ArrayList<Employee>();
    }

    public EmployeeServiceImpl(ArrayList<Employee> listEmployee) {
        this.listEmployee = listEmployee;
    }

    @Override
    public void displayEmployee() {
        for (Employee em: listEmployee) {
            System.out.println(em);
        }
    }


    @Override
    public void addEmployee(Employee em) {
        this.listEmployee.add(em);

    }

    @Override
    public void editEmployee(int j) {
//        int size = listEmployee.size();
//        for(int i = 0 ; i < size; i ++){
//            if(i==j ) {
//
//                System.out.println("nhập mã sản phẩm");
//                int maSanPham = scanner.nextInt();
//                scanner.nextLine();
//                System.out.println("nhập tên sản phẩm");
//                String tenSanPham1 = scanner.nextLine();
//                System.out.println("nhập hản sản xuất");
//                String hanSanXuat = scanner.nextLine();
//                System.out.println("nhập giá");
//                double gia = scanner.nextDouble();
//                scanner.nextLine();
//                System.out.println("nhập mô tả");
//                String moTa = scanner.nextLine();
//
//                listEmployee.get(i).setMaSanPham(maSanPham);
//                listEmployee.get(i).setTenSanPham(tenSanPham1);
//                listEmployee.get(i).setHangSanXuat(hanSanXuat);
//                listEmployee.get(i).setGia(gia);
//                listEmployee.get(i).setMoTa(moTa);
//                break;
//
//            }
//
//        }

    }
}
