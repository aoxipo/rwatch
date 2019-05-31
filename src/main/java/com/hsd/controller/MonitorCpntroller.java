package com.hsd.controller;

import com.hsd.model.RDevice;
import com.hsd.model.RFence;
import com.hsd.model.RMember;
import com.hsd.model.User;
import com.hsd.service.DeviceService;
import com.hsd.service.FenceService;
import com.hsd.service.MemberService;
import com.hsd.util.AjaxJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.*;

//import com.hsd.service.DeviceInforService;
//import com.hsd.service.MemberService;

@Controller
@RequestMapping("/monitor")
public class MonitorCpntroller {
    /**
     * 到监控页面
     */
    @Autowired
    private DeviceService deviceService;
    @Autowired
    private FenceService fenceService;
    @Autowired
    private  MemberService memberService;

    @RequestMapping(value ="device")
    public String list(){
        return "mapmodel/moniter";
    }

    @RequestMapping(value ="fence")
    public ModelAndView toperson(HttpSession session){
        ModelAndView mav=new ModelAndView("mapmodel/personfence");
        User user = (User)session.getAttribute("user");
        if(user==null)
        {
            return new ModelAndView("login");
        }
        mav.addObject("user",user);
        return mav;
    }

    @RequestMapping(value ="/addfence")
    @ResponseBody
    public AjaxJson addfence(HttpSession session, HttpServletRequest request) {
        AjaxJson j = new AjaxJson();
        User user = (User) session.getAttribute("user");
        if(user==null)
        {
            j.setSuccess(false);
            j.setMsg("未登录！请先登录！");
            return j;
        }
        try{
            //({"":,"ByDevice":,"ByMember":,"X":,"Y":,"Radius":,});
            int ByDevice=Integer.parseInt( request.getParameter("ByDevice"));
            int ByMember=Integer.parseInt( request.getParameter("ByMember"));
            Double lat=Double.parseDouble(request.getParameter("X"));
            Double lng=Double.parseDouble(request.getParameter("Y"));
            Double Radius=Double.parseDouble(request.getParameter("Radius"));
            Date t=new Date();
            RFence rFence=new RFence();
            rFence.setBydevice(ByDevice);
            rFence.setBymember(ByMember);
            rFence.setRadius(Radius);
            rFence.setTime(t);
            rFence.setY(lng);
            rFence.setX(lat);
            int flag=fenceService.InsertFence(rFence);
            if(flag==1)
            {
                j.setSuccess(true);
                j.setMsg("成功插入");
            }
            else{
                j.setSuccess(false);
                j.setMsg("插入失败,插入返回值不为1");
            }
        }
        catch (Exception e)
        {
            j.setSuccess(false);
            j.setMsg(e.getMessage());
        }
        return j;
    }

    @RequestMapping(value ="/subfence")
    @ResponseBody
    public AjaxJson subfence(HttpSession session, HttpServletRequest request){
        AjaxJson j = new AjaxJson();
        User user = (User) session.getAttribute("user");
        if(user==null)
        {
            j.setSuccess(false);
            j.setMsg("未登录！请先登录！");
            return j;
        }
        try{
            //({"FenceId":});
            int FenceId=Integer.parseInt(request.getParameter("FenceId"));
            int flag=fenceService.SubFence(FenceId);
            if(flag==1)
            {
                j.setSuccess(true);
                j.setMsg("成功删除");
            }
            else{
                j.setSuccess(false);
                j.setMsg("删除失败,插入返回值不为1");
            }
        }
        catch (Exception e)
        {
            j.setSuccess(false);
            j.setMsg(e.getMessage());
        }
        return j;
    }

    @RequestMapping(value ="/changefence")
    @ResponseBody
    public AjaxJson changefence(HttpSession session, HttpServletRequest request){
        AjaxJson j = new AjaxJson();
        User user = (User) session.getAttribute("user");
        if(user==null)
        {
            j.setSuccess(false);
            j.setMsg("未登录！请先登录！");
            return j;
        }
        try{
            //({"FenceId":,"ByDevice":,"ByMember":,"X":,"Y":,"Radius":,});
            int FenceId=Integer.parseInt(request.getParameter("FenceId"));
            int ByDevice=Integer.parseInt( request.getParameter("ByDevice"));
            int ByMember=Integer.parseInt( request.getParameter("ByMember"));
            Double lat=Double.parseDouble(request.getParameter("X"));
            Double lng=Double.parseDouble(request.getParameter("Y"));
            Double Radius=Double.parseDouble(request.getParameter("Radius"));
            RFence rFence=new RFence();
            rFence.setFenceid(FenceId);
            rFence.setBydevice(ByDevice);
            rFence.setBymember(ByMember);
            rFence.setX(lat);
            rFence.setY(lng);
            rFence.setRadius(Radius);
            int flag=fenceService.ChangeFence(rFence);
            if(flag==1)
            {
                j.setSuccess(true);
                j.setMsg("成功更新");
            }
            else{
                j.setSuccess(false);
                j.setMsg("更新失败,sql返回值不为1");
            }
        }
        catch (Exception e)
        {
            j.setSuccess(false);
            j.setMsg(e.getMessage());
        }
        return j;
    }

    @RequestMapping(value ="/searchfence")
    @ResponseBody
    public AjaxJson searchfence(HttpSession session, HttpServletRequest request){
        AjaxJson j = new AjaxJson();
        User user = (User) session.getAttribute("user");
        if(user==null)
        {
            j.setSuccess(false);
            j.setMsg("未登录！请先登录！");
            return j;
        }
        try{
            //({"FenceId",});
            int FenceId=Integer.parseInt(request.getParameter("FenceId"));
            RFence rFence=fenceService.SelectFence(FenceId);
            if(rFence!=null)
            {
                j.put("RFence",rFence);
                j.setSuccess(true);
                j.setMsg("查询成功");
            }
            else{
                j.setSuccess(false);
                j.setMsg("查询失败,sql返回值为null");
            }
        }
        catch (Exception e)
        {
            j.setSuccess(false);
            j.setMsg(e.getMessage());
        }
        return j;
    }

    @RequestMapping(value ="/loadtodata")
    @ResponseBody
    public AjaxJson getdata(HttpSession session){

        AjaxJson j = new AjaxJson();

        User user = (User)session.getAttribute("user");
        List<RDevice> Allinforlist = deviceService.MultiTableq();

        //        /*分组*/
        Map<String, List<RDevice>> map = new HashMap<String, List<RDevice>>();

        for(RDevice obj : Allinforlist){
            if(map.containsKey(obj.getUser().getBygroup())){//map中存在此id，将数据存放当前key的map中
                map.get(obj.getUser().getBygroup()).add(obj);
            }else{//map中不存在，新建key，用来存放数据
                List<RDevice> tmpList = new ArrayList<RDevice>();
                tmpList.add(obj);
                map.put(obj.getUser().getBygroup(), tmpList);
            }

        }
        List<Object> group_list_temp=new ArrayList<Object>();
        for(Map.Entry<String, List<RDevice>> entry : map.entrySet()){
            Map<String, Object> jtemp= new HashMap<String, Object>();
            jtemp.put("name",entry.getKey());
            jtemp.put("children",entry.getValue());

            group_list_temp.add(jtemp);
//            System.out.println("键 key ："+entry.getKey()+" 值value ："+entry.getValue());
//            for(RDevice obj:entry.getValue()){
//                j2.put("children",obj);
//            }
        }


        if (user != null) {

            j.setSuccess(true);
            j.setMsg("成功！");
            j.put("list",Allinforlist);
            j.put("grouplist",map);
            j.put("group",group_list_temp);
        } else {
            j.setSuccess(false);
            j.setMsg("未登录！");
        }

        return j;
//        List<RDevice> list = deviceService.GetDeviceList();
//        List<RMember> memberlist = memberService.GetALLList();
//        List<RDeviceInfor> deviceInforlist=deviceInforService.GetdeviceinforALLList();
       // JSONArray jsonArray = JSONArray.fromObject(list);
//        Object[] objs = list.toArray();

//
//
//
//
//
//
//        for(int i = 0;i < list.size();i++){
//            System.out.println("it's "+i);
//            System.out.println(deviceInforlist.get(i));
//        }
//

    }

    @RequestMapping(value ="/searchmember")
    @ResponseBody
    public AjaxJson searchmemberbyname(HttpSession session, HttpServletRequest request){
        AjaxJson j = new AjaxJson();
        User user = (User)session.getAttribute("user");
        if(user==null)
        {
            j.setSuccess(false);
            j.setMsg("未登录！请先登录！");
            return j;
        }
        String membername=request.getParameter("membername");
        if(membername==null) {
            j.setSuccess(false);
            j.setMsg("未接收到值！");
            return j;
        }
        List<RDevice> Allinforlist = deviceService.MultiTableqBymemberName(membername);
        //        /*分组*/
        //Map<String, List<RDevice>> map = new HashMap<String, List<RDevice>>();
        //for(RDevice obj : Allinforlist){
//            if(map.containsKey(obj.getUser().getBygroup())){//map中存在此id，将数据存放当前key的map中
//                map.get(obj.getUser().getBygroup()).add(obj);
//            }else{//map中不存在，新建key，用来存放数据
//                List<RDevice> tmpList = new ArrayList<RDevice>();
//                tmpList.add(obj);
//                map.put(obj.getUser().getBygroup(), tmpList);
//            }
//        }
//        List<Object> group_list_temp=new ArrayList<Object>();
//        for(Map.Entry<String, List<RDevice>> entry : map.entrySet()){
//            Map<String, Object> jtemp= new HashMap<String, Object>();
//            jtemp.put("name",entry.getKey());
//            jtemp.put("children",entry.getValue());
//
//            group_list_temp.add(jtemp);
//            System.out.println("键 key ："+entry.getKey()+" 值value ："+entry.getValue());
//            for(RDevice obj:entry.getValue()){
//                j2.put("children",obj);
//            }
 //       }
        j.put("list",Allinforlist);
        j.setSuccess(true);
        return j;
    }

    @RequestMapping(value ="/changegroup")
    @ResponseBody
    public AjaxJson changegroupbymemberid(HttpSession session, HttpServletRequest request){
        AjaxJson j = new AjaxJson();
        User user = (User)session.getAttribute("user");
        if(user==null)
        {
            j.setSuccess(false);
            j.setMsg("未登录！请先登录！");
            return j;
        }
        int memberid=Integer.parseInt(request.getParameter("MemberId"));
        String Group=request.getParameter("ByGroup");
        if(request.getParameter("MemberId")==null||Group==null)
        {
            j.setSuccess(false);
            j.setMsg("未取到值!");
            return j;
        }
        RMember rMember=new RMember();
        rMember.setMemberid(memberid);
        rMember.setBygroup(Group);
        int ans=memberService.ChangeMember(rMember);
        if(ans!=1)
        {
            j.setSuccess(false);
            j.setMsg("sql更改出错");
        }
        else
        {
            j.setSuccess(true);
        }
        return j;
    }
}
