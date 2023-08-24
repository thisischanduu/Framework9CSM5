package genericLibraries;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.BaseClassFinder;

public class ListnerImplementation implements ITestListener{

 @Override
 public void onTestStart(ITestResult result) {
  System.out.println(result.getMethod().getMethodName()+" Test Script Execution Started");
 }

 @Override
 public void onTestSuccess(ITestResult result) {
  System.out.println(result.getMethod().getMethodName()+" Pass");
 }

 @Override
 public void onTestFailure(ITestResult result) {
  System.out.println(result.getMethod().getMethodName()+" Fail");
  System.out.println(result.getMethod().getMethodName()+"Failure occured due to: "+result.getThrowable());
  TakesScreenshot ts = (TakesScreenshot) (BaseClass.sdriver);
  JavaUtility jutil = new JavaUtility();
  File src = ts.getScreenshotAs(OutputType.FILE);
  File dest = new File("./Screenshot/"+result.getMethod().getMethodName()+"_"+jutil.getCurrentTime()+".png");
  FileUtils.copyFile(src, dest);
 }

 @Override
 public void onTestSkipped(ITestResult result) {
  System.out.println(result.getMethod().getMethodName()+" Skipped");
  System.out.println("Skipped due to: "+result.getThrowable());
 }

 @Override
 public void onStart(ITestContext context) {
  System.out.println("Suite Execution Strated");
 }

 @Override
 public void onFinish(ITestContext context) {
  System.out.println("Suite Execution Finished");
 }
}