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
            ������ʽ˵��
            if(sqlWhere.getJflx()!=null && !sqlWhere.getJflx().equals("")){
                criteria.andJflxEqualTo(sqlWhere.getJflx());
            }
            Like������ʽ˵��
            if(sqlWhere.getJflx()!=null && !sqlWhere.getJflx().equals("")){
                criteria.andJflxLike("%"sqlWhere.getJflx()"%");
            }
            ��������ڸ�ʽ����Ҫ����ʽת��
            SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");������
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
            �����Ҫ���or���� ����������
            if(sqlWhere.getGlbm()!=null && !sqlWhere.getGlbm().equals("")){
                 criteria.addSDWhereSql(" (tjdd like '%"+sqlWhere.getGlbm()+"%' or tjgsdd like '%"+sqlWhere.getGlbm()+"%') ");
            }
            �����ڲ�ѯ����
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
            throw new ExcuteException(FrmGnid.selectListPageWechatMenuinfo+"ʧ�ܣ�"+e.getMessage());
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
            ��������ڸ�ʽ����Ҫ����ʽת��
            SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");������
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
            throw new ExcuteException(FrmGnid.selectListPageWechatMenuinfo+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public List<HashMap<String,Object>> selectListWechatMenuinfoBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=wechatMenuinfoDao.selectListWechatMenuinfoBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageWechatMenuinfo+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public WechatMenuinfoEntity selectWechatMenuinfoByPrimaryKey(String menuid) {
        try {
            WechatMenuinfoEntity entity = wechatMenuinfoDao.selectWechatMenuinfoByPrimaryKey(menuid);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectWechatMenuinfo+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult insertWechatMenuinfo(WechatMenuinfoEntity entity) {
        try {
            return wechatMenuinfoDao.insertWechatMenuinfo(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertWechatMenuinfo+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult insertWechatMenuinfoSelective(WechatMenuinfoEntity entity) {
        try {
            return wechatMenuinfoDao.insertWechatMenuinfoSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertWechatMenuinfo+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult updateWechatMenuinfoByPrimaryKey(WechatMenuinfoEntity entity) {
        try {
            return wechatMenuinfoDao.updateWechatMenuinfoByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateWechatMenuinfo+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult updateWechatMenuinfoBySqlWhere(WechatMenuinfoEntity entity, WechatMenuinfoSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return wechatMenuinfoDao.updateWechatMenuinfoBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateWechatMenuinfo+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult updateWechatMenuinfoBySqlWhereSelective(WechatMenuinfoEntity entity, WechatMenuinfoSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return wechatMenuinfoDao.updateWechatMenuinfoBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateWechatMenuinfo+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult updateWechatMenuinfoByPrimaryKeySelective(WechatMenuinfoEntity entity) {
        try {
            return wechatMenuinfoDao.updateWechatMenuinfoByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateWechatMenuinfo+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult deleteWechatMenuinfoByPrimaryKey(String menuid) {
        try {
            return wechatMenuinfoDao.deleteWechatMenuinfoByPrimaryKey(menuid);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteWechatMenuinfo+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult deleteWechatMenuinfoBySqlWhere(WechatMenuinfoSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return wechatMenuinfoDao.deleteWechatMenuinfoBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteWechatMenuinfo+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public int countWechatMenuinfoBySqlWhere(WechatMenuinfoSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        return (Integer)wechatMenuinfoDao.countWechatMenuinfoBySqlWhere(sqlWhere);
    }

    public String createMenu(WechatMenugroupSqlWhere sqlWhere) {
    	WechatClientinfoEntity client = wechatClientinfoService.selectWechatClientinfoByPrimaryKey(sqlWhere.getClientsxh());//΢�ſ�����ƽ̨
    
		List<WechatMenugroupEntity> _list = wechatMenugroupService.selectListWechatMenugroupBySqlWhere(sqlWhere);//һ���˵�
		
		if(client != null){
			AccessToken at = WechatUtil.getAccessToken(client.getAppid(), client.getAppsecret(),client.getWxtype());  // ���ýӿڻ�ȡaccess_token  
			if(null==at)
				return "AccessToken ��ȡ��������appid��secret�Ƿ���ȷ";
			
			List<Button> btn_list = new LinkedList<Button>();
			for (WechatMenugroupEntity sysMenugroup : _list) {
				String []menus = sysMenugroup.getMenuvalue().split(",");
				List<Button> sub_btns = new LinkedList<Button>();
				for (String menustring : menus) {
					WechatMenuinfoEntity menuinfo = wechatMenuinfoDao.selectWechatMenuinfoByPrimaryKey(menustring);//�����˵�
					if(menuinfo != null){
						if(menuinfo.getMenutype().equals("click")){
							CommonButton temp = new CommonButton();
							temp.setName(menuinfo.getMenuname());
							temp.setType("click");
							temp.setKey(menuinfo.getMenukey());
							System.out.println("���ͣ�click,���ƣ�"+menuinfo.getMenuname()+",���ݣ�"+menuinfo.getMenukey());
							sub_btns.add(temp);
						}else if(menuinfo.getMenutype().equals("view")){
							ViewButton temp = new ViewButton();
							temp.setName(menuinfo.getMenuname());
							temp.setType("view");
							temp.setUrl(menuinfo.getMenuurl());
							System.out.println("���ͣ�view,���ƣ�"+menuinfo.getMenuname()+",���ݣ�"+menuinfo.getMenuurl());
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
			return "δ��ѯ��΢�ſͻ�����ϢWechatClientinfo";
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