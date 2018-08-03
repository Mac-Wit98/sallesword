package pl.akademiakodu.sellsword.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.akademiakodu.sellsword.dao.CustomerDao;
import pl.akademiakodu.sellsword.dao.SellswordDao;
import pl.akademiakodu.sellsword.model.Sellsword;

@Controller
public class SellswordController {
    @Autowired
    private SellswordDao sellswordDao;
    @Autowired
    private CustomerDao customerDao;

    @GetMapping("/sellsword/add")
    public String addSellsword(ModelMap modelMap) {
        modelMap.put("sellsword", new Sellsword());
        modelMap.put("customers", customerDao.findAll());
        return "sellsword/add";
    }

    @PostMapping("/sellsword/add")
    public String save(@ModelAttribute Sellsword sellsword, ModelMap modelMap) {
        modelMap.put("sellsword", sellsword);
        sellswordDao.save(sellsword);
        return "sellsword/show";
    }

}
