package com.yedam.pgr.referenceType;
import java.util.Scanner;

//***********************************
//게임을 시작합니다...!!
//***********************************
//**[1]회-[1]구 입니다. (숫자(1~9)입력 후 엔터를 누르세요!)
//5
//스트라이크 입니다!
//**[1]회-[2]구 입니다. (숫자(1~9)입력 후 엔터를 누르세요!)
//1
//볼 입니다!
//**[1]회-[3]구 입니다. (숫자(1~9)입력 후 엔터를 누르세요!)
//1
//스트라이크 입니다!
//*******[1]회 결과*******
//**[1]구>>5->스트라이크
//**[2]구>>1->볼
//**[3]구>>1->스트라이크
//***********************************
//
//
//* 자바 야구게임 만들기
//1. 숫자를 자신이 3개 지정한다.
//2. 자릿수랑 숫자가 일치하면 strike, 숫자만 맞고 자릿수가 틀리면 ball , 둘다 틀리면 out
//3. 10번의 기회를 줘서 10번안에 맞히면 축하합니다!
//  10번안에 맞히지 못하면 실패했습니다!

 

//------------------------------------------------------------------

public class BaseBall
{
 //지정 자릿수
 static int[] v_Count = {5,2,1};
 //스트라이크,볼,아웃 변수
 static String v_strStrike = "스트라이크";
 static String v_strBall   = "볼";
 static String v_strOut    = "아웃";
 //while문 무한반복 flag
 static boolean v_bFlag    = true;
 //한 회당 스트라이크,볼,아웃 상태 저장 배열 변수
 static String[] v_arrStatus = new String[3];
 //한 회당 입력한 숫자 저장 배열 변수
 static int[] v_arrTotBall = new int[3];
 //한 회당 스트라이크 카운터
 static int v_arrResult  = 0;
 
 public static void main(String[] args)
 {


		
		  //회 카운터
		  int v_nTotCnt = 0;
		  //한 회당 시도 횟수
		  int v_nTryCnt = 0; 
		  //스트라이크,볼,아웃 상태 저장 변수
		  String v_strStatus = "";
		  
		  System.out.println("***********************************");
		  System.out.println("게임을 시작합니다...!!");
		  System.out.println("***********************************");
		  //무한루프
		 
		  while(v_bFlag)
		   {
		   System.out.println("**["+(v_nTotCnt+1)+"]회-["+(v_nTryCnt+1)+"]구 입니다. (숫자(1~9)입력 후 엔터를 누르세요!)");
		   //한자씩 키보드로 입력 받음
		   
		   Scanner sc = new Scanner(System.in); 
		   //키보드로 입력받은 숫자를 변수에 저장
		   int v_nBall = sc.nextInt();
		   //시도 횟수와 입력받은 숫자를 매개변수로 넘겨 스타라이크인지 볼인지 아웃인지 계산하여 리턴
		   v_strStatus = getStatus(v_nTryCnt, v_nBall);
		   //상태 메시지 출력
		   System.out.println(v_strStatus+" 입니다!");
		   //현재 입력된 상태를 배열에 저장
		   
		   v_arrStatus[v_nTryCnt]  = v_strStatus;
		   //현재 입력된 숫자를 배열에 저장
		   
	     	v_arrTotBall[v_nTryCnt] = v_nBall;
		   //회당 시도횟수를 증가시킨다.
		   v_nTryCnt++;      
		   //1회 3번을 완료한 경우 빠져나온다.
		   
		   if(v_nTryCnt > 2)
		   {
		    //해당 회의 결과를 출력한다.
		    System.out.println("*******["+(v_nTotCnt+1)+"]회 결과*******");
		    for(int k=0;k<v_arrStatus.length;k++)
		    {
		     System.out.println("**["+(k+1)+"]구>>"+v_arrTotBall[k]+"->"+v_arrStatus[k]);
		    }   
		    System.out.println("***********************************");
		    //해당 회에 스크라이크가 3번이면 축하합니다 메시지를 출력한다.
		 
			if(v_arrResult == 3)
		    {
		     System.out.println("***********************************");
		     System.out.println("3진 아웃 축하합니다.!!!!!!!!!!!!!!!!!!!!");
		     System.out.println("***********************************");
		     break;
		    }
		    else
		    {
		     //10회까지 삼진 못시킬 경우, 실패 메시지를 출력한다.
		     if((v_nTotCnt+1) == 10)
		     {
		      System.out.println("***********************************");
		      System.out.println("10회까지 맞추지 못했습니다...도전 실패 ㅠㅜ");
		      System.out.println("***********************************");
		      break;
		     }
		     else
		     { 
		      //회당 시도횟수 0으로 초기화
		      v_nTryCnt  = 0;
		      //스트라이크 횟수 0으로 초기화
		      v_arrResult = 0;
		      //회를 1증가시킨다. 1회 였으면 2회로 증가
		      v_nTotCnt++;
		     }
		    }
		   }
		  }
		 }
		 //입력한 숫자에 대한 상태 반환 메서드
		 public static String getStatus(int v_nCnt, int v_nBall)
		 {
		  String v_strRtn    = "";
		  int    v_nBallChk  = 0;
		  
		  //자리수와 숫자가  일치할 경우
		 
	     	if(v_Count[v_nCnt] == v_nBall)
		  {
		   //스트라이크 메시지를 변수에 담는다.
		   
		v_strRtn = v_strStrike;
		   //스트라이크일 경우 증가시킨다.
		  
		v_arrResult++;
		  }
		  else
		  {
		   //자리수와 숫자가 일치하지 않을 경우
		   //loop를 돌려서 입력한 숫자가 존재하는지 조회한다.->볼을 찾기 위함
		   for(int i=0; i<v_Count.length; i++)
		   {
		    if(v_nBall == v_Count[i])
		    {
		     //자리수는 틀리지만 숫자가 존재할 경우 증가시킨다.
		     v_nBallChk++;
		    }
		   }
		   //숫자만 맞고 자리수가 틀릴 경우 ball
		   if(v_nBallChk > 0)
		   {
		    
			v_strRtn = v_strBall;
		   }
		   else
		   {
		    //숫자, 자리수 둘다 틀릴경우 out
		    
			v_strRtn = v_strOut;
		   }
		  }
		  return v_strRtn;
		 }
		
	}
