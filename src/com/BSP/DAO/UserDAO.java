package com.BSP.DAO;

import com.BSP.DAO.mybatisINF.UserMapper;
import com.BSP.bean.User;
import org.apache.ibatis.session.SqlSession;

public class UserDAO {
    public User findUserByName (User user) {
        database db = new database();
        SqlSession sqlSession = null;
        try {
            sqlSession = db.getSqlsession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            User u = mapper.findUserByName(user.getUserName());
            return u;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }

        return null;
    }

    public void addUser (User user) {
        database db = new database();
        SqlSession sqlSession = null;
        try {
            sqlSession = db.getSqlsession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            mapper.addUser(user.getUserName(), user.getPassword(), user.getTel(), user.getStatus());
            sqlSession.commit();
        } catch (Exception e) {
            sqlSession.rollback();
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    public void updateUserOnPassword (User user) {
        database db = new database();
        SqlSession sqlSession = null;
        try {
            sqlSession = db.getSqlsession();
            System.out.println("UserDAO's updateUserOnPassword: " + user.getUserName() + " "  + user.getPassword() + " " + user.getTel() + " " + user.getStatus());
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            mapper.updateUserOnPassword(user.getUserName(), user.getPassword());
            sqlSession.commit();
        } catch (Exception e) {
            sqlSession.rollback();
            e.printStackTrace();
        } finally {
            if(sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    public void updateUserOntel (User user) {
        database db = new database();
        SqlSession sqlSession = null;
        try {
            sqlSession = db.getSqlsession();
            System.out.println("UserDAO's updateUserOntel: " + user.getUserName() + " "  + user.getPassword() + " " + user.getTel() + " " + user.getStatus());
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            mapper.updateUserOntel(user.getUserName(), user.getTel());
            sqlSession.commit();
        } catch (Exception e) {
            sqlSession.rollback();
            e.printStackTrace();
        } finally {
            if(sqlSession != null) {
                sqlSession.close();
            }
        }
    }


}