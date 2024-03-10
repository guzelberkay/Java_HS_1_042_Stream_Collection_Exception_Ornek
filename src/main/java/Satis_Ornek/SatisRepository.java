package Satis_Ornek;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SatisRepository {
    private List<Satis> satisList = new ArrayList<>();
    public void save(Satis satis){
        satisList.add(satis);
    }

    public void update(Satis satis){
        Optional<Satis> satisOptional = satisList.stream().filter(x->x.getId().equals(satis.getId())).findFirst();
        if(satisOptional.isEmpty())
            throw  new SatisException(ErrorType.REPOSITORY_ERROR_UPDATE);
        Satis satisEdit = satisOptional.get();
        satisEdit.setAdet(satis.adet);
        satisEdit.setFiyat(satis.getFiyat());
        satisEdit.setTplamFiyat(satis.toplamFiyat);
        satisEdit.setUrunAdi(satis.getUrunAdi());

    }
    public Satis findById(Long id){
        Optional<Satis> satisOptional = satisList.stream().filter(s->s.getId().equals(id)).findFirst();
        if (satisOptional.isEmpty())
            throw new SatisException(ErrorType.REPOSITORY_ERROR_SEARCH);
        return satisOptional.get();
    }
}
