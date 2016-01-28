package database;




	public class Product {
		
		private int id;
		private String name;
		private int salary;
		private int dept;
		
		public Product() {
			// TODO Auto-generated constructor stub
		}

		public Product(int id, String name, int salary, int dept) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
			this.dept = dept;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}

		public int getDept() {
			return dept;
		}

		public void setDept(int dept) {
			this.dept = dept;
		}

	}