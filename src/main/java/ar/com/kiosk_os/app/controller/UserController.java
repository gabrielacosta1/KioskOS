package ar.com.kiosk_os.app.controller;

import ar.com.kiosk_os.app.models.entity.User;
import ar.com.kiosk_os.app.models.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("usuario")
public class UserController {
    @Autowired
    private IUserService iUserService;

    @RequestMapping(value = {"/","/listar"})
    private String listarUsuarios(Model model){
        List<User> users = iUserService.findAll();
        model.addAttribute("gabo",users);
        for (int i = 0; i < users.size(); i++){
            System.out.print(users.get(i).getFullname());
        }

        return "usuario/listar";
    }
}
