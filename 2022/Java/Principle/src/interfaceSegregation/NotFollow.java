package interfaceSegregation;

interface IMultiPrinter{
	public void print();
	public void getPrintSpoolDetails();
	public void scan();
	public void scanPhoto();
	public void fax();
	public void internetFax();
}

class XeroxWorkCenter implements IMultiPrinter{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getPrintSpoolDetails() {
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
	public void fax() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void internetFax() {
		// TODO Auto-generated method stub
		
	}
	
}


class HPrinterNScanner implements IMultiPrinter{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getPrintSpoolDetails() {
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
	public void fax() {
		// no implementation of fax because it does not support fax
		
	}

	@Override
	public void internetFax() {
		// no implementation of internetFax
		
	}
	
}


class CanonPrinter implements IMultiPrinter{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getPrintSpoolDetails() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void scan() {
		// no implementation of scan
		
	}

	@Override
	public void scanPhoto() {
		// no implementation of scan photo
		
	}

	@Override
	public void fax() {
		// no implementation of fax
		
	}

	@Override
	public void internetFax() {
		// no implementation of internetFax
		
	}
	
}

public class NotFollow {
	// this doesn't follow ISP because there some methods implemented blank
	// which can create problems if we try to access those methods
}
