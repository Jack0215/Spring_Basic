package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.dto.TestDTO;

public class TestDAO {
	
			String driver="oracle.jdbc.driver.OracleDriver";
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String userid ="scott";
			String passwd ="tiger";
		

			public ArrayList<TestDTO> select() throws SQLException {
				ArrayList<TestDTO> list = new ArrayList<TestDTO>();
				Connection con = null;
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				try {
					// DataSource에서 connection 얻어오기
					con = DriverManager.getConnection(url, userid, passwd);
					String sql = "select * from test";
					pstmt = con.prepareStatement(sql);
					rs = pstmt.executeQuery();
					while (rs.next()) {
						int n = rs.getInt("num");
						String n2 = rs.getString("username");
						String n3 = rs.getString("address");
						TestDTO dto = new TestDTO(n, n2, n3);
						list.add(dto);
					}
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						if (rs != null)
							rs.close();
						if (pstmt != null)
							pstmt.close();
						if (con != null)
							con.close();
					} catch (Exception e) {
						e.printStackTrace();
					}

				}
				return list;
			}

			public void insert(int num, String name, String address) {
				Connection con = null;
				PreparedStatement pstmt = null;
				try {
					con = DriverManager.getConnection(url, userid, passwd);
					String sql = "insert into test (num, username, address) values(?,?,?)";
					pstmt = con.prepareStatement(sql);
					pstmt.setInt(1, num);
					pstmt.setString(2, name);
					pstmt.setString(3, address);
					//***********************TX 시작**********************
					con.setAutoCommit(false);
					int n = pstmt.executeUpdate();
					//int x  = 5/0;
					if(n==1)con.commit();
					
					
					System.out.println("업데이트 갯수:" + n);
				} catch (Exception e) {
					try {
						con.rollback();
					}catch(Exception ex) {
						ex.printStackTrace();
					}
					e.printStackTrace();
					
				} finally {
					
					try {
						
						if (pstmt != null)
							pstmt.close();
						if (con != null)
							con.setAutoCommit(true);
							con.close();
						
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			
			
			public void insert2(int num, String name, String address) {
				Connection con = null;
				PreparedStatement pstmt1 = null;
				PreparedStatement pstmt2 = null;
				try {
					con = DriverManager.getConnection(url, userid, passwd);
					
					String sql1 = "insert into test (num, username, address) values(?,?,?)";
					String sql2 = "insert into test (num, username, address) values(?,?,?)";
					pstmt1 = con.prepareStatement(sql1);
					pstmt2 = con.prepareStatement(sql2);
					pstmt1.setInt(1, num);
					pstmt1.setString(2, name);
					pstmt1.setString(3, address);
					pstmt2.setInt(1, num);
					pstmt2.setString(2, name);
					pstmt2.setString(3, address);
					//***********************TX 시작**********************
					con.setAutoCommit(false);
					int n1 = pstmt1.executeUpdate();
					int n2 = pstmt2.executeUpdate();
					
					//int x  = 5/0;
					if(n1==1)con.commit();
					if(n1==2)con.commit();
					
					
					
					System.out.println("업데이트 갯수:" + n1);
					System.out.println("업데이트 갯수:" + n2);
				} catch (Exception e) {
					try {
						con.rollback();
					}catch(Exception ex) {
						ex.printStackTrace();
					}
					e.printStackTrace();
					
				} finally {
					
					try {
						
						if (pstmt1 != null)
							pstmt1.close();
							
						if (pstmt2 != null)
							pstmt2.close();
						if (con != null)
							con.setAutoCommit(true);
							con.close();
						
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}

			public void delete(int num) {
				Connection con = null;
				PreparedStatement pstmt = null;
				try {
					con = DriverManager.getConnection(url, userid, passwd);
					String sql = "delete from test where num = ?";
					pstmt = con.prepareStatement(sql);
					pstmt.setInt(1, num);
					int n = pstmt.executeUpdate();
					System.out.println("삭제된 갯수:" + n);
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						if (pstmt != null)
							pstmt.close();
						if (con != null)
							con.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}

			public void update(int num, String name, String address) throws SQLException {
				Connection con = null;
				PreparedStatement pstmt = null;
				try {
					con = DriverManager.getConnection(url, userid, passwd);
					String sql = "update test set username =?, address=? where num =? ";
					pstmt = con.prepareStatement(sql);
					pstmt.setString(1, name);
					pstmt.setString(2, address);
					pstmt.setInt(3, num);
					int n = pstmt.executeUpdate();
					System.out.println("업데이트 된 갯수:" + n);
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						if (pstmt != null)
							pstmt.close();
						if (con != null)
							con.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}

}
