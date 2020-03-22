package cn.trader.item.web;

import cn.trader.item.pojo.Item;
import cn.trader.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("item")
public class ItemController {

    @Autowired
    private ItemService itemService;
    /*
    @ResponseBody:把响应对象转成json,放到响应体的body里面
     */
    // @ResponseBody
    @PostMapping
    /*
    这里是rest风格的返回.
     */
    public ResponseEntity<Item> saveItem(Item item) {
        // 校验价格是否为空
        if (item.getPrice() == null) {
            // return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("价格不能为空");//400


        }

        item = itemService.saveItem(item);

        return ResponseEntity.status(HttpStatus.CREATED).body(item);//201
    }
}
