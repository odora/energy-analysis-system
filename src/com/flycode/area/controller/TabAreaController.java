/**
 * 
 */
package com.flycode.area.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.flycode.common.BaseController;
import com.flycode.area.entity.TabArea;
import com.flycode.area.entity.TabAreaExample;
import com.flycode.area.service.iface.TabAreaService;
import com.flycode.util.JsonUtil;

/**
 * @author VM
 * 树形结构查询
 */
@Controller
@RequestMapping(value = "/api")
public class TabAreaController extends BaseController {
	
	@Autowired
	private TabAreaService tabAreaService;
	
	/**
	 * 查询树形area
	 * @param callBack
	 * @param infoID
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/tree/area/query", produces = "application/x-javascript;charset=UTF-8")
	public String queryAreas(@RequestParam(value = "callback", required = true) String callBack,
			@RequestParam(value = "infoID", required = false) String infoID,
			@RequestParam(value = "opID", required = false) Integer opID) {
		// 如果不传infoID 则查询根节点，否则查询infoID的子节点
		TabAreaExample example = new TabAreaExample();
		if (null == infoID || infoID.trim().equals("")) {
			example.or().andLevelEqualTo(1);
			return  JsonUtil.jsonArray2Sting(callBack,tabAreaService.selectByExample(example));
		}
		else {
			// opID为null时 查询一，二级
			if(null==opID){
				TabArea area = tabAreaService.selectByPrimaryKey(infoID);
				if(null == area){
					example.or().andLevelEqualTo(1);
					return  JsonUtil.jsonArray2Sting(callBack,tabAreaService.selectByExample(example));
				} 
				// 1 == area.getLevel()
				else {
					example.or().andFatherIDEqualTo(infoID);
					return  JsonUtil.jsonArray2Sting(callBack,tabAreaService.selectByExample(example));
				}
			}
			// 不为空是查询表具（三级）
			else {
				HashMap<String,Object> params = new HashMap<>();
				params.put("infoID", infoID);
				params.put("opID", opID);
				return  JsonUtil.jsonArray2Sting(callBack,tabAreaService.selectByInfoID(params));
			}
		}
		
	}
	
	
}
