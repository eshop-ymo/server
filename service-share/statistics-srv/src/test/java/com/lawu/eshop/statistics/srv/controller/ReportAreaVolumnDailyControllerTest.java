package com.lawu.eshop.statistics.srv.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;

import com.gexin.fastjson.JSONObject;
import com.lawu.eshop.statistics.param.ReportAreaVolumnDailyParam;
import com.lawu.eshop.statistics.srv.StatisticsSrvApplicationTest;
import com.lawu.eshop.statistics.srv.service.ReportAreaVolumnDailyService;
import com.lawu.framework.web.HttpCode;
import com.lawu.utils.DateUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = StatisticsSrvApplicationTest.class)
@WebAppConfiguration
public class ReportAreaVolumnDailyControllerTest {

	private MockMvc mvc;
	
	@Autowired
	private ReportAreaVolumnDailyController reportAreaVolumnDailyController;
	
	@Autowired
	private  ReportAreaVolumnDailyService reportAreaVolumnDailyService;
	
	@Before
	public void setUp() throws Exception {
		mvc = MockMvcBuilders.standaloneSetup(reportAreaVolumnDailyController).build();
	}
	
	
	@Transactional(rollbackFor = Exception.class)
	@Rollback
	@Test
	public void insertReportAreaVolumnDaily() {
		ReportAreaVolumnDailyParam param = new ReportAreaVolumnDailyParam();
		param.setCityId(1);
		param.setGmtCreate(new Date());
		param.setGmtReport(DateUtil.getMonthBefore(new Date()));
		param.setAreaId(1);
		param.setProvinceId(1);
		param.setType((byte)1);
		param.setReportTotalMoney(new BigDecimal(1));
		String requestJson = JSONObject.toJSONString(param);
		RequestBuilder request = post("/reportAreaVolumnDaily/insertReportAreaVolumnDaily").contentType(MediaType.APPLICATION_JSON).content(requestJson);
		try {
			ResultActions perform = mvc.perform(request);
			MvcResult mvcResult = perform.andExpect(status().is(HttpCode.SC_CREATED))
					.andDo(MockMvcResultHandlers.print()).andReturn();
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	
	
	@Transactional(rollbackFor = Exception.class)
	@Rollback
	@Test
	public void selectReportAreaVolumeDailyInMonth() {
		ReportAreaVolumnDailyParam param = new ReportAreaVolumnDailyParam();
		param.setCityId(1);
		param.setGmtCreate(new Date());
		param.setGmtReport(DateUtil.getMonthBefore(new Date()));
		param.setAreaId(1);
		param.setProvinceId(1);
		param.setType((byte)1);
		param.setReportTotalMoney(new BigDecimal(1));
		reportAreaVolumnDailyService.insertReportAreaVolumnDaily(param);
		String requestJson = JSONObject.toJSONString(param);
		RequestBuilder request = get("/reportAreaVolumnDaily/selectReportAreaVolumeDailyInMonth").contentType(MediaType.APPLICATION_JSON)
				.param("bdate", DateUtil.getDateFormat(DateUtil.getFirstDayOfMonth(DateUtil.getMonthBefore(new Date()))))
				.param("edate", DateUtil.getDateFormat(DateUtil.getLastDayOfMonth(DateUtil.getMonthBefore(new Date()))));
		
		try {
			ResultActions perform = mvc.perform(request);
			MvcResult mvcResult = perform.andExpect(status().is(HttpCode.SC_OK))
					.andDo(MockMvcResultHandlers.print()).andReturn();
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	
	
	@Transactional(rollbackFor = Exception.class)
	@Rollback
	@Test
	public void selectReportAreaVolumnDaily() {
		ReportAreaVolumnDailyParam param = new ReportAreaVolumnDailyParam();
		param.setCityId(1);
		param.setGmtCreate(new Date());
		param.setGmtReport(DateUtil.getMonthBefore(new Date()));
		param.setAreaId(1);
		param.setProvinceId(1);
		param.setType((byte)1);
		param.setReportTotalMoney(new BigDecimal(1));
		reportAreaVolumnDailyService.insertReportAreaVolumnDaily(param);
		String requestJson = JSONObject.toJSONString(param);
		RequestBuilder request = get("/reportAreaVolumnDaily/selectReportAreaVolumnDaily").param("cityId", "1")
				.param("bdate", DateUtil.getDateFormat(DateUtil.getFirstDayOfMonth(DateUtil.getMonthBefore(new Date()))))
				.param("edate", DateUtil.getDateFormat(DateUtil.getLastDayOfMonth(DateUtil.getMonthBefore(new Date()))));
		
		try {
			ResultActions perform = mvc.perform(request);
			MvcResult mvcResult = perform.andExpect(status().is(HttpCode.SC_OK))
					.andDo(MockMvcResultHandlers.print()).andReturn();
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	
}
