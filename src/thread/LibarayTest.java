package thread;

import java.util.ArrayList;

class Library {
	private ArrayList<String> shelf = new ArrayList<>();

	public Library() {
		shelf.add("원피스1");
		shelf.add("원피스2");
		shelf.add("원피스3");
//        shelf.add("원피스4");
//        shelf.add("원피스5");

	}

	public ArrayList<String> getShelf() {
		return shelf;
	}

	public void setShelf(ArrayList<String> shelf) {
		this.shelf = shelf;
	}

	public synchronized String rentBook() throws InterruptedException {
		Thread th1 = Thread.currentThread();

		if (shelf.size() == 0) {
			System.out.println(th1.getName() + " waiting start");
			wait();
			System.out.println(th1.getName() + " waiting ended");
		}

		if (shelf.size() > 0) {
			String book = shelf.remove(0);
			return book;
		} else
			return null;

	}

	public synchronized void returnBook(String book) throws InterruptedException {
		Thread th1 = Thread.currentThread();

		shelf.add(book);
		notifyAll();
		System.out.println(th1.getName() + " : " + book + " is returned");
	}

}

class Student extends Thread {
	private String name;

	public Student(String name) {
		this.name = name;
	}

	public void run() {
		try {
			String bookTitle = LibarayTest.library.rentBook();
			if (bookTitle == null) {
				System.out.println("책을 빌리지 못함");
				return;
			}
			sleep(2000);
			LibarayTest.library.returnBook(bookTitle);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

public class LibarayTest {
	public static Library library = new Library();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Lee");
		Student s2 = new Student("Kim");
		Student s3 = new Student("Park");
		Student s4 = new Student("Shin");
		Student s5 = new Student("Yoon");
		s1.start();
		s2.start();
		s3.start();
		s4.start();
		s5.start();

	}

}
