package business;

import dataAccess.kodlama.HibernateDao;
import dataAccess.kodlama.JdbcIoDao;
import entities.Category;

import java.util.Locale;

public class CatagoryManager {

public static void add(Category category) throws Exception {
    //iş kuraları
    if(!category.getName().equalsIgnoreCase("Web Geliştirme")){
        throw new Exception(category.getName()+"isminde bir kategori bulunamadı.");
    }else {
        System.out.println("Kategori seçildi."+ category.getName().substring(0,1).toUpperCase() + category.getName().substring(1).toLowerCase());
    }
      /*
            girilen kurs isminin substring'ini alır -> sıfırıncı indexten birinci indexe kadar(1 dahil değil).Yani ilk harfi alır onada toUpperCase uygular.
            küçük girilse dahi büyük yazar.
            Sonra diğer kalan harfler'e yine substring uygular -> birinci indexten itibaren sonuna kadar al ve toLowerCase uygula.Yani hepsi küçük olur.
            Küçük girilse bile
           categoryName -> Yani ilk harfe substring ve toupper case + geriye kalan harflere substring ve tolower case
             */

    JdbcIoDao jdbcIoDao= new JdbcIoDao();
    jdbcIoDao.add(category);

    HibernateDao hibernateDao= new HibernateDao();
    hibernateDao.add(category);
}
}
