package interfaceSegregation;

class XeroxWorkCentre implements IPrint, IScan, IFax {
	@Override
	public void fax() {
		// TODO Auto-generated method stub

	}
	@Override
	public void internetFax() {
		// TODO Auto-generated method stub

	}
	@Override
	public void scan() {
		// TODO Auto-generated method stub

	}
	@Override
	public void scanPhoto() {
		// TODO Auto-generated method stub

	}
	@Override
	public void print() {
		// TODO Auto-generated method stub

	}
	@Override
	public void getPrintSpoolDetails() {
		// TODO Auto-generated method stub

	}
}

class HPprinterNScanner implements IPrint,IScan{
	@Override
	public void scan() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void scanPhoto() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void getPrintSpoolDetails() {
		// TODO Auto-generated method stub
		
	}
}

class CannonPrinter implements IPrint{
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void getPrintSpoolDetails() {
		// TODO Auto-generated method stub
		
	}	
}



public class Follow {
	// this is following interface segregation principle
}
