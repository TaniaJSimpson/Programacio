package CervellPorters;

public class Porter {

	public boolean comprovar(Criteris clientT){
		
		if (! clientT.getNom().equals(CervellPorters.REVISARNOM)
                && clientT.getNom() != null){
            return false;
		}if (clientT.getEdat()!=(CervellPorters.REVISAREDAT)
	                && clientT.getEdat() != 0){
	            return false;
		}if (clientT.getDiners()!=(CervellPorters.REVISARDINERS)
	                && clientT.getDiners() != 0){
	            return false;
		}if (! clientT.getSexe().equals(CervellPorters.REVISARSEXE)
                && clientT.getSexe() != null){
            return false;
		}if (!clientT.getCalcat().equals(CervellPorters.REVISARCALCAT)
	                && clientT.getCalcat() != null){
	            return false;

        }
		
		
            return true;
    }
}
	
