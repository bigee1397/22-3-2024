package com.productapp;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.productapp.model.Product;
import com.productapp.service.IProductService;



@SpringBootApplication
public class SpringProductappMybatisApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringProductappMybatisApplication.class, args);
	}
	
	@Autowired
	IProductService productService;

	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Add new Product\n" 
        + "2.Update consultation fees of doctor with his doctor_id" 
        + "\n3.Delete a doctor record by the doctor_id" 
        + " \n4.Find Doctor by doctor_id" 
        + "\n5.Find all doctors" 
        + "\n6.Find doctors by speciality" 
        + "\n7.Find doctors by speciality and experience greater than" 
        + "\n8.Find doctors by speciality and consultation fees less than" 
        + "\n9.Find doctors by speciality and ratings greater than" 
        + "\n10.Find doctors by speciality and name containing" 
        + "\n11.Exit");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        
        try {
            switch (choice) {
                case 1:
                    System.out.println("**** Adding a new Product ****");
                    System.out.println("Enter the name of the Product: ");
					String proName = sc.next();
					System.out.println("Enter the brand of the Product: ");
                    String proBrand = sc.next();
                    System.out.println("Enter the price of the Product: ");
					double price = sc.nextDouble();
					System.out.println("Enter the category of the Product: ");
					String category = sc.next();
					Product product = new Product();
					product.setProductName(proName);
					product.setCategory(category);
					product.setBrand(proBrand);
					product.setPrice(price);
					productService.addProduct(product);
					break;
//                case 2:
//                    System.out.println("***** Updating the consultation fees of doctor *****");
//                    System.out.println("Enter the id of the doctor: ");
//                    int id=sc.nextInt();
//                    System.out.println("Enter the updated consultation fee of the doctor: ");
//                    double conFee = sc.nextDouble();
//                    doctorService.updateDoctor(conFee, id);
//                    break;
//                case 3:
//                    System.out.println("***** Delete a doctor record ******");
//                    System.out.println("Enter the doctor_id you want to remove: ");
//                    int docDeleteId = sc.nextInt();
//                    doctorService.deleteDoctor(docDeleteId);
//                    break;
//                    case 4:
//                    System.out.println("***** Fetching a doctor record ******");
//                    System.out.println("Enter the Doctor id: ");
//                    int docId = sc.nextInt();
//                    System.out.println(doctorService.getDoctorById(docId));
//                    break;
//                case 5:
//                    System.out.println("****** Getting all the doctors *****");
//                    for (Doctor doctor : doctorService.getAll()) {
//                        System.out.println(doctor);
//                    }
//                    break;
//                case 6:
//                    DoctorSpecPrint.getSpecs();
//                    String speciality = Specialization.valueOf(sc.next()).getSpeciality();
//                    for (Doctor doctor : doctorService.getBySpeciality(speciality)) {
//                        System.out.println(doctor);
//                    }
//                    break;
//                case 7:
//                    System.out.println("****** Getting the doctors with experience and speciality *****");
//                    DoctorSpecPrint.getSpecs();
//                    String speciality2 = Specialization.valueOf(sc.next()).getSpeciality();
//                    System.out.println("Enter the experience greater than you want to find");
//                    int exp = sc.nextInt();
//                    for (Doctor doctor : doctorService.getBySpecialityAndExp(speciality2, exp)) {
//                        System.out.println(doctor);
//                    }
//                    break;
//                case 8:
//                    System.out.println("****** Getting the doctors with speciality and consultation fees less than *****");
//                    DoctorSpecPrint.getSpecs();
//                    String speciality3 = Specialization.valueOf(sc.next()).getSpeciality();
//                    System.out.println("Enter the consultaion fees less than you want to find");
//                    double conFees = sc.nextDouble();
//                    for (Doctor doctor : doctorService.getBySpecialityAndLessFees(speciality3, conFees)) {
//                        System.out.println(doctor);
//                    }
//                    break;
//                case 9:
//                    System.out.println("****** Getting the doctors with speciality and ratings greater than *****");
//                    DoctorSpecPrint.getSpecs();
//                    String speciality4 = Specialization.valueOf(sc.next()).getSpeciality();
//                    System.out.println("Enter the ratings greater than you want to find");
//                    int ratings = sc.nextInt();
//                    for (Doctor doctor : doctorService.getBySpecialityAndRatings(speciality4, ratings)) {
//                        System.out.println(doctor);
//                    }
//                    break;
//                case 10:
//                    System.out.println("****** Getting the doctors with speciality and name containing *****");
//                    DoctorSpecPrint.getSpecs();
//                    String speciality5 = Specialization.valueOf(sc.next()).getSpeciality();
//                    System.out.println("Enter the part of the name you remember or want to find");
//                    String name = sc.next();
//                    for (Doctor doctor : doctorService.getBySpecialityAndNameContains(speciality5, name)) {
//                        System.out.println(doctor);
//                    }
//                    break;
                case 11:
                    System.exit(0);
                    break;
                default:
                System.out.println("Invalid Input.........");
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
