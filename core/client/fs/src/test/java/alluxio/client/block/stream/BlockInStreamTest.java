/*
 * The Alluxio Open Foundation licenses this work under the Apache License, version 2.0
 * (the "License"). You may not use this work except in compliance with the License, which is
 * available at www.apache.org/licenses/LICENSE-2.0
 *
 * This software is distributed on an "AS IS" basis, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied, as more fully set forth in the License.
 *
 * See the NOTICE file distributed with this work for information regarding copyright ownership.
 */

package alluxio.client.block.stream;

import alluxio.client.file.FileSystemContext;

import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * Unit tests for {@link BlockInStream}.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({FileSystemContext.class})
public final class BlockInStreamTest {
  /**
  @Test
  public void readFromLocal() throws Exception {
    String clientHostname = "clientHostname";
    try (Closeable c = new ConfigurationRule(
        ImmutableMap.of(PropertyKey.USER_HOSTNAME, clientHostname)).toResource()) {
      long blockId = 0;
      FileSystemContext context = mock(FileSystemContext.class);
      BlockWorkerClient blockWorkerClient = mock(BlockWorkerClient.class);
      when(context.createBlockWorkerClient(any(WorkerNetAddress.class)))
          .thenReturn(blockWorkerClient);
      // Mock the lock result to show that the block is locked in Alluxio storage.
      LockBlockResult lockResult =
          new LockBlockResult().setLockBlockStatus(LockBlockStatus.ALLUXIO_BLOCK_LOCKED);

      // Set the data server hostname to match the client hostname.
      when(blockWorkerClient.getWorkerNetAddress())
          .thenReturn(new WorkerNetAddress().setHost(clientHostname));
      BlockInStream stream = BlockInStream.createNettyBlockInStream(context, "ufsPath", blockId, 100,
          0, 0, new WorkerNetAddress(), InStreamOptions.defaults());
      // The client hostname matches the worker hostname, but the stream goes to an Alluxio worker
      // because it initially tried to read from UFS.
      Assert.assertFalse(stream.isShortCircuit());

      // Set the data server hostname to not match the client hostname.
      when(blockWorkerClient.getWorkerNetAddress())
          .thenReturn(new WorkerNetAddress().setHost("remotehost"));
      stream = BlockInStream.createUfsBlockInStream(context, "ufsPath", blockId, 100,
          0, 0, new WorkerNetAddress(), InStreamOptions.defaults());
      // The client hostname do not matches the worker hostname, so the stream should not go to a
      // local file.
      Assert.assertFalse(stream.isShortCircuit());
    }
  }
  */
}
