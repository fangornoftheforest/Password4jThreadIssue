POC of Password4j-worker thread issue

07-May-2025 14:22:52.406 WARNING [main] org.apache.catalina.loader.WebappClassLoaderBase.clearReferencesThreads The web application [Password4jThreadIssue_war_exploded] appears to have started a thread named [password4j-worker-19] but has failed to stop it. This is very likely to create a memory leak. Stack trace of thread:
 java.base/jdk.internal.misc.Unsafe.park(Native Method)
 java.base/java.util.concurrent.locks.LockSupport.park(LockSupport.java:371)
 java.base/java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionNode.block(AbstractQueuedSynchronizer.java:519)
 java.base/java.util.concurrent.ForkJoinPool.unmanagedBlock(ForkJoinPool.java:3780)
 java.base/java.util.concurrent.ForkJoinPool.managedBlock(ForkJoinPool.java:3725)
 java.base/java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:1707)
 java.base/java.util.concurrent.LinkedBlockingQueue.take(LinkedBlockingQueue.java:435)
 java.base/java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1070)
 java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1130)
 java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
 java.base/java.lang.Thread.run(Thread.java:1583)

 Run w/ Tomcat 11
