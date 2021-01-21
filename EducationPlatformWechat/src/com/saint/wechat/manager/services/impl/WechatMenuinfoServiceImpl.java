package com.saint.wechat.manager.services.impl;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.services.imp.WechatUtil;
import com.saint.wechat.manager.bean.WechatClientinfoEntity;
import com.saint.wechat.manager.bean.WechatMenugroupEntity;
import com.saint.wechat.manager.bean.WechatMenuinfoEntity;
import com.saint.wechat.manager.dao.IWechatClientinfoDao;
import com.saint.wechat.manager.dao.IWechatMenugroupDao;
import com.saint.wechat.manager.dao.IWechatMenuinfoDao;
import com.saint.wechat.manager.services.IWechatClientinfoService;
import com.saint.wechat.manager.services.IWechatMenugroupService;
import com.saint.wechat.manager.services.IWechatMenuinfoService;
import com.saint.wechat.manager.sqlWhere.WechatMenugroupSqlWhere;
import com.saint.wechat.manager.sqlWhere.WechatMenuinfoSqlWhere;
import com.saint.wechat.manager.sqlWhere.WechatMenuinfoSqlWhere.Criteria;
import com.saint.wechat.pojo.AccessToken;
import com.saint.wechat.pojo.Button;
import com.saint.wechat.pojo.CommonButton;
import com.saint.wechat.pojo.ComplexButton;
import com.saint.wechat.pojo.Menu;
import com.saint.wechat.pojo.ViewButton;

public class WechatMenuinfoServiceImpl implements IWechatMenuinfoService {
    private IWechatMenuinfoDao wechatMenuinfoDao;
    
    private IWechatClientinfoService wechatClientinfoService;
    
    private IWechatMenugroupService wechatMenugroupService;

    public List<WechatMenuinfoEntity> selectListPageWechatMenuinfoBySqlWhere(WechatMenuinfoSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            条件格式说明
            if(sqlWhere.getJflx()!=null && !sqlWhere.getJflx().equals("")){
                criteria.andJflxEqualTo(sqlWhere.getJflx());
            }
            Like条件格式说明
            if(sqlWhere.getJflx()!=null && !sqlWhere.getJflx().equals("")){
                criteria.andJflxLike("%"sqlWhere.getJflx()"%");
            }
            如果有日期格式，需要做格式转换
            SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");短日期
            if((sqlWhere.getXjrqq()!=null && !sqlWhere.getXjrqq().equals(""))&&(sqlWhere.getXjrqz()!=null && !sqlWhere.getXjrqz().equals("")) ){
                Date date_s = null;
                Date date_e = null;
                try {
                    date_s = dateFormat.parse(sqlWhere.getXjrqq());
                    date_e = dateFormat.parse(sqlWhere.getXjrqz());
                } catch (ParseException e) {
                    date_s=new Date();
                    date_e=new Date();
                }
                criteria.andXjrqBetween(date_s, date_e);
            }
            如果需要添加or条件 或其他条件
            if(sqlWhere.getGlbm()!=null && !sqlWhere.getGlbm().equals("")){
                 criteria.addSDWhereSql(" (tjdd like '%"+sqlWhere.getGlbm()+"%' or tjgsdd like '%"+sqlWhere.getGlbm()+"%') ");
            }
            长日期查询条件
            if(sqlWhere.getYjrssjq()!=null && !sqlWhere.getYjrssjq().equals("")){
                criteria.andSnqdyjddsjGreaterThanOrEqualTo(Timestamp.valueOf(sqlWhere.getYjrssjz()));
            }
            **/
        }
        try {
            List<WechatMenuinfoEntity> entitylist=wechatMenuinfoDao.selectListPageWechatMenuinfoBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageWechatMenuinfo+"失败："+e.getMessage());
        }
    }

    public List<WechatMenuinfoEntity> selectListWechatMenuinfoBySqlWhere(WechatMenuinfoSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getMenuid()!=null && !sqlWhere.getMenuid().equals("")){
                criteria.andMenuidLike(sqlWhere.getMenuid()+"%");
            }
            /**
            if(sqlWhere.getJflx()!=null && !sqlWhere.getJflx().equals("")){
                criteria.andJflxEqualTo(sqlWhere.getJflx());
            }
            如果有日期格式，需要做格式转换
            SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");短日期
            if((sqlWhere.getXjrqq()!=null && !sqlWhere.getXjrqq().equals(""))&&(sqlWhere.getXjrqz()!=null && !sqlWhere.getXjrqz().equals("")) ){
                Date date_s = null;
                Date date_e = null;
                try {
                    date_s = dateFormat.parse(sqlWhere.getXjrqq());
                    date_e = dateFormat.parse(sqlWhere.getXjrqz());
                } catch (ParseException e) {
                    date_s=new Date();
                    date_e=new Date();
                }
                criteria.andXjrqBetween(date_s, date_e);
            }
            **/
        }
        try {
            List<WechatMenuinfoEntity> entitylist=wechatMenuinfoDao.selectListWechatMenuinfoBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageWechatMenuinfo+"失败："+e.getMessage());
        }
    }

    public List<HashMap<String,Object>> selectListWechatMenuinfoBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=wechatMenuinfoDao.selectListWechatMenuinfoBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageWechatMenuinfo+"失败："+e.getMessage());
        }
    }

    public WechatMenuinfoEntity selectWechatMenuinfoByPrimaryKey(String menuid) {
        try {
            WechatMenuinfoEntity entity = wechatMenuinfoDao.selectWechatMenuinfoByPrimaryKey(menuid);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectWechatMenuinfo+"失败："+e.getMessage());
        }
    }

    public ExcuteResult insertWechatMenuinfo(WechatMenuinfoEntity entity) {
        try {
            return wechatMenuinfoDao.insertWechatMenuinfo(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertWechatMenuinfo+"失败："+e.getMessage());
        }
    }

    public ExcuteResult insertWechatMenuinfoSelective(WechatMenuinfoEntity entity) {
        try {
            return wechatMenuinfoDao.insertWechatMenuinfoSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertWechatMenuinfo+"失败："+e.getMessage());
        }
    }

    public ExcuteResult updateWechatMenuinfoByPrimaryKey(WechatMenuinfoEntity entity) {
        try {
            return wechatMenuinfoDao.updateWechatMenuinfoByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateWechatMenuinfo+"失败："+e.getMessage());
        }
    }

    public ExcuteResult updateWechatMenuinfoBySqlWhere(WechatMenuinfoEntity entity, WechatMenuinfoSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return wechatMenuinfoDao.updateWechatMenuinfoBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateWechatMenuinfo+"失败："+e.getMessage());
        }
    }

    public ExcuteResult updateWechatMenuinfoBySqlWhereSelective(WechatMenuinfoEntity entity, WechatMenuinfoSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return wechatMenuinfoDao.updateWechatMenuinfoBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateWechatMenuinfo+"失败："+e.getMessage());
        }
    }

    public ExcuteResult updateWechatMenuinfoByPrimaryKeySelective(WechatMenuinfoEntity entity) {
        try {
            return wechatMenuinfoDao.updateWechatMenuinfoByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateWechatMenuinfo+"失败："+e.getMessage());
        }
    }

    public ExcuteResult deleteWechatMenuinfoByPrimaryKey(String menuid) {
        try {
            return wechatMenuinfoDao.deleteWechatMenuinfoByPrimaryKey(menuid);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteWechatMenuinfo+"失败："+e.getMessage());
        }
    }

    public ExcuteResult deleteWechatMenuinfoBySqlWhere(WechatMenuinfoSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return wechatMenuinfoDao.deleteWechatMenuinfoBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteWechatMenuinfo+"失败："+e.getMessage());
        }
    }

    public int countWechatMenuinfoBySqlWhere(WechatMenuinfoSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        return (Integer)wechatMenuinfoDao.countWechatMenuinfoBySqlWhere(sqlWhere);
    }

    public String createMenu(WechatMenugroupSqlWhere sqlWhere) {
    	WechatClientinfoEntity client = wechatClientinfoService.selectWechatClientinfoByPrimaryKey(sqlWhere.getClientsxh());//微信开发者平台
    
		List<WechatMenugroupEntity> _list = wechatMenugroupService.selectListWechatMenugroupBySqlWhere(sqlWhere);//一级菜单
		
		if(client != null){
			AccessToken at = WechatUtil.getAccessToken(client.getAppid(), client.getAppsecret(),client.getWxtype());  // 调用接口获取access_token  
			if(null==at)
				return "AccessToken 获取错误，请检查appid和secret是否正确";
			
			List<Button> btn_list = new LinkedList<Button>();
			for (WechatMenugroupEntity sysMenugroup : _list) {
				String []menus = sysMenugroup.getMenuvalue().split(",");
				List<Button> sub_btns = new LinkedList<Button>();
				for (String menustring : menus) {
					WechatMenuinfoEntity menuinfo = wechatMenuinfoDao.selectWechatMenuinfoByPrimaryKey(menustring);//二级菜单
					if(menuinfo != null){
						if(menuinfo.getMenutype().equals("click")){
							CommonButton temp = new CommonButton();
							temp.setName(menuinfo.getMenuname());
							temp.setType("click");
							temp.setKey(menuinfo.getMenukey());
							System.out.println("类型：click,名称："+menuinfo.getMenuname()+",内容："+menuinfo.getMenukey());
							sub_btns.add(temp);
						}else if(menuinfo.getMenutype().equals("view")){
							ViewButton temp = new ViewButton();
							temp.setName(menuinfo.getMenuname());
							temp.setType("view");
							temp.setUrl(menuinfo.getMenuurl());
							System.out.println("类型：view,名称："+menuinfo.getMenuname()+",内容："+menuinfo.getMenuurl());
							sub_btns.add(temp);
						}
					}
				}
				ComplexButton mainbtn = new ComplexButton(); 
				mainbtn.setName(sysMenugroup.getMenuname());
				mainbtn.setSub_button(toArray(sub_btns));
				btn_list.add(mainbtn);
			}
			Menu mainmenu = new Menu();
			mainmenu.setButton(toArray(btn_list));
			System.out.println("token:"+at.getToken());
			System.out.println(WechatUtil.createMenu(mainmenu,at.getToken(),client.getClientid(),client.getWxtype()));
			return WechatUtil.createMenu(mainmenu,at.getToken(),client.getClientid(),client.getWxtype());
		}else{
			return "未查询到微信客户端信息WechatClientinfo";
		}
		
	}

	private Button[] toArray(List<Button> list){
		Button[] result = new Button[list.size()];
		for(int i=0;i<list.size();i++){
			result[i] = list.get(i);
		}
		return result;
	}
	
    public void setWechatMenuinfoDao(IWechatMenuinfoDao wechatMenuinfoDao) {
        this.wechatMenuinfoDao = wechatMenuinfoDao;
    }

    public IWechatMenuinfoDao getWechatMenuinfoDao() {
        return wechatMenuinfoDao;
    }

	public IWechatClientinfoService getWechatClientinfoService() {
		return wechatClientinfoService;
	}

	public void setWechatClientinfoService(
			IWechatClientinfoService wechatClientinfoService) {
		this.wechatClientinfoService = wechatClientinfoService;
	}

	public IWechatMenugroupService getWechatMenugroupService() {
		return wechatMenugroupService;
	}

	public void setWechatMenugroupService(
			IWechatMenugroupService wechatMenugroupService) {
		this.wechatMenugroupService = wechatMenugroupService;
	}

    
}