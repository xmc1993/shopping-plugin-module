package com.nju.controller;

import com.nju.dto.ItemVo;
import com.nju.dto.Response;
import com.nju.entity.Clock;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.xm.xmnlp.dic.JItem;
import org.xm.xmnlp.segword.SegMode;
import org.xm.xmnlp.segword.Segmenter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xmc1993 on 16/4/8.
 */
@Controller
@RequestMapping("/api")
public class ShowController {

    @RequestMapping("/test")
    public Clock test(){
        Clock clock = new Clock();
        return clock;
    }

    @RequestMapping("/nlp")
    public Response jiebaParse(String sentence){
        Response response = new Response();
        if(sentence == null){
            response.setSuccess(false);
            response.setErrMsg("sentence参数不能为空");
            return response;
        }
        ArrayList<ItemVo> result = new ArrayList<>();
        Segmenter segmenter = new Segmenter();
        List<JItem> jItems = segmenter.process(sentence, SegMode.SEARCH);
        for (JItem jItem : jItems) {
            ItemVo itemVo = new ItemVo();
            itemVo.setNature(jItem.nature);
            itemVo.setWord(jItem.word);
            result.add(itemVo);
        }
        response.setData(result);
        return response;
    }
}
