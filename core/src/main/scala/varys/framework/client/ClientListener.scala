package varys.framework.client

/**
 * Callbacks invoked by framework client when various events happen. Currently supported events:
 * connecting to the cluster and disconnecting.
 *
 * Users of this API should *not* block inside the callback methods.
 */
private[varys] trait ClientListener {
  // Not safe to use the Client until this method is called
  def connected(clientId: String): Unit

  def disconnected(): Unit
}