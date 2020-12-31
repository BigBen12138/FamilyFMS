package cn.edu.dlmu.dao;

import cn.edu.dlmu.base.BaseMapper;
import cn.edu.dlmu.pojo.Account;
import cn.edu.dlmu.pojo.IOList;
import org.apache.ibatis.annotations.*;
import org.springframework.dao.DataAccessException;

import java.util.List;
import java.util.Map;

@Mapper
public interface AccountMapper extends BaseMapper<Account> {

	/*增加一个用户*/
	Integer add(Account account) throws Exception;

	/*删除一个用户*/
	Integer delete(@Param("UserId") int id) throws Exception;
	
	/*修改一个用户*/
	Integer update(Account account) throws Exception;
	
	/*根据登录名查询用户*/
	Account queryByLoginName(@Param("loginName") String loginName) throws Exception;

	List<Account> queryAll();

	@SuppressWarnings("rawtypes")
	List<Account> queryByParams(Map map) throws DataAccessException;

}
