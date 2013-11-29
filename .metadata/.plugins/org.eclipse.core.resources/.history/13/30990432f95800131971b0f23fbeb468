package model.business.service;

public class UserServiceProxy implements model.business.service.UserService {
  private String _endpoint = null;
  private model.business.service.UserService userService = null;
  
  public UserServiceProxy() {
    _initUserServiceProxy();
  }
  
  public UserServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initUserServiceProxy();
  }
  
  private void _initUserServiceProxy() {
    try {
      userService = (new model.business.service.UserServiceServiceLocator()).getUserService();
      if (userService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)userService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)userService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (userService != null)
      ((javax.xml.rpc.Stub)userService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public model.business.service.UserService getUserService() {
    if (userService == null)
      _initUserServiceProxy();
    return userService;
  }
  
  public boolean isRegistered(java.lang.String email, java.lang.String password) throws java.rmi.RemoteException{
    if (userService == null)
      _initUserServiceProxy();
    return userService.isRegistered(email, password);
  }
  
  public boolean updateProfile(model.business.entities.User user) throws java.rmi.RemoteException{
    if (userService == null)
      _initUserServiceProxy();
    return userService.updateProfile(user);
  }
  
  public java.lang.String hello() throws java.rmi.RemoteException{
    if (userService == null)
      _initUserServiceProxy();
    return userService.hello();
  }
  
  public boolean registerNewUser(model.business.entities.User user) throws java.rmi.RemoteException{
    if (userService == null)
      _initUserServiceProxy();
    return userService.registerNewUser(user);
  }
  
  
}