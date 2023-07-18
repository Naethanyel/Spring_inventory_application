package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        if (productRepository.count() + partRepository.count() < 1) {

            Product aston_martin = new Product("aston martin", 400000.0, 2);
            Product mustang = new Product("mustang", 60000.0, 3);
            Product ferrari = new Product("ferrari", 100000.0, 1);
            Product corvette = new Product("corvette", 76000.0, 2);
            Product rolls_royce = new Product("rolls royce", 240000.0, 4);

            productRepository.save(aston_martin);
            productRepository.save(mustang);
            productRepository.save(ferrari);
            productRepository.save(corvette);
            productRepository.save(rolls_royce);

            InhousePart hood = new InhousePart();
            InhousePart spoiler = new InhousePart();
            InhousePart wheel = new InhousePart();
            InhousePart ornament = new InhousePart();
            InhousePart muffler = new InhousePart();

            hood.setName("Ferrari hood");
            hood.setInv(1);
            hood.setPrice(2000.00);
            //hood.setMin(1);
            //hood.setMax(10);

            spoiler.setName("Mustang Spoiler");
            spoiler.setInv(5);
            spoiler.setPrice(800.00);
            //spoiler.setMin(1);
            //spoiler.setMax(10);

            muffler.setName("Aston Martin Muffler");
            muffler.setInv(2);
            muffler.setPrice(4000.00);
            //muffler.setMin(1);
            //muffler.setMax(10);

            ornament.setName("Rolls Royce Hood Ornament");
            ornament.setInv(4);
            ornament.setPrice(800.00);
            //ornament.setMin(1);
            //ornament.setMax(10);

            wheel.setName("Corvette Steering Wheel");
            wheel.setInv(3);
            wheel.setPrice(600.00);
            //wheel.setMin(1);
            //wheel.setMax(10);

            partRepository.save(hood);
            partRepository.save(muffler);
            partRepository.save(ornament);
            partRepository.save(wheel);
            partRepository.save(spoiler);
        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
