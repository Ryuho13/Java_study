package sec01.exam02;

import java.util.LinkedList;
import java.util.Queue;

// Queue 를 이용한 간단한 메시지 큐를 구현한 예제 
// 먼저 넣은 메시지가 반대쪽으로 먼저 나오기 떄문에 넣은 순서대로 메시지가 처리됨
// => FIFO (선입선출)
public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> messegeQueue = new LinkedList<>();
		
		// 메시지 저장
		messegeQueue.offer(new Message("sendMail", "유재석"));
		messegeQueue.offer(new Message("sendSMS", "김재현"));
		messegeQueue.offer(new Message("sendKakaotalk", "이미주"));
		
		// 메시지 큐가 비었는지 확인
		while (!messegeQueue.isEmpty()) {
			Message message = messegeQueue.poll();
			
			switch (message.command) {
			case "sendMail": 
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS": 
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;	
			case "sendKakaotalk": 
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			}
			}
		}
		
	}


