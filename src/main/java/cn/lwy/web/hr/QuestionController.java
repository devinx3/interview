package cn.lwy.web.hr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lwy.pojo.Question;
import cn.lwy.pojo.QuestionExample;
import cn.lwy.service.QuestionService;

@Controller
public class QuestionController {
	
	@Autowired
	private QuestionService questionService;
	
	@RequestMapping("question-list")
	public String toLoginPage(Model model) {
		test();
//		int id = 1;
//		long time1 = System.currentTimeMillis();
//		System.out.println(questionService.getById(id));
//		long time2 = System.currentTimeMillis();
//		System.out.println("time: " + (time2-time1));
//		Question list = questionService.getWithTagById(id);
//		long time3 = System.currentTimeMillis();
//		System.out.println("time: " + (time3-time2));
//		System.out.println(questionService.getWithChoiceById(id));
//		System.out.println("time: " + (System.currentTimeMillis()-time3));
//		model.addAttribute("list", list);
//		System.out.println(list);
		System.out.println("========");
		int id = 1;
		long time1 = System.currentTimeMillis();
		QuestionExample example = new QuestionExample();
		example.createCriteria().andDifficultIsNotNull();
		
		List<Question> list = questionService.getByExample(example);
		System.out.println("---"+ list.size());
		for (Question question : list) {
			System.out.println(question);
		}
		long time2 = System.currentTimeMillis();
		System.out.println("time: " + (time2-time1));
		list = questionService.getWithTagByExample(example);
		System.out.println("tag = " + list.size());
		for (Question question : list) {
			System.out.println(question);
		}
		long time3 = System.currentTimeMillis();
		System.out.println("time: " + (time3-time2));
		list = questionService.getWithChoiceByExample(example);
		System.out.println("choice = " + list.size());
		for (Question question : list) {
			System.out.println(question);
		}
		long time4 = System.currentTimeMillis();
		System.out.println("time: " + (time4-time3));
		list = questionService.getFullByExample(example);
		System.out.println("full = " + list.size());
		for (Question question : list) {
			System.out.println(question);
		}
		System.out.println("time: " + (System.currentTimeMillis()-time4));
		/*List<Question> list = questionService.getByExample(id);
		long time3 = System.currentTimeMillis();
		System.out.println("time: " + (time3-time2));
		
		System.out.println(questionService.getWithChoiceById(id));
		long time4 = System.currentTimeMillis();
		System.out.println("time: " + (time4-time3));
		System.out.println(questionService.getFullById(id));
		System.out.println("time: " + (System.currentTimeMillis()-time4));
		model.addAttribute("list", list);
		System.out.println(list);
		*/
		
		return "question-list";
	}
	
	
	public void test() {
		int id = 1;
		long time1 = System.currentTimeMillis();
		System.out.println(questionService.getById(id));
		long time2 = System.currentTimeMillis();
		System.out.println("time: " + (time2-time1));
		Question list = questionService.getWithTagById(id);
		long time3 = System.currentTimeMillis();
		System.out.println("time: " + (time3-time2));
		System.out.println(questionService.getWithChoiceById(id));
		System.out.println("time: " + (System.currentTimeMillis()-time3));
		System.out.println(list);
	}
}