package com.example.demo;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import omikuzi.Omikuzi_hantei;

@Controller
public class FortuneController {

    @RequestMapping("/fortune/")
    /**
     * おみくじ判定のハンドラー
     * 
     * @param model おみくじ判定結果を含んだオブジェクト
     * @return 返却画面
     */
    public String fortune(Model model) {

        Random rand = new Random();
        int fortuneParam = rand.nextInt(100);

        String fortuneResult = new Omikuzi_hantei().hantei(fortuneParam);

        model.addAttribute("result", fortuneResult);

        return "index";
    }
}
