package it.ariadne.designPat.structural.adapter;
/**
 * La classe Adapter estende Contact e richiama al suo interno la classe Employee in modo tale da ritornare una stringa che contenga il nome intero del contatto.
 * @author cristofaro
 *
 */
public class EmployeeAdapter extends Contact{

	private Employee employee;

    public EmployeeAdapter(Employee employee){
    	this.employee=employee;
    }
    
	@Override
	public String FullName() {
		// TODO Auto-generated method stub
		String fullEmployee = employee.getFirstName()+" "+ employee.getLastName();
		return fullEmployee;
	}
	

}
