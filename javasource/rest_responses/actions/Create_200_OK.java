// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package rest_responses.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import rest_responses.RESTResponseProvider;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * The request was successful and the response body contains the representation requested.
 */
public class Create_200_OK extends CustomJavaAction<IMendixObject>
{
	private IMendixObject __HTTPResponse;
	private system.proxies.HttpResponse HTTPResponse;
	private java.lang.String Content;

	public Create_200_OK(IContext context, IMendixObject HTTPResponse, java.lang.String Content)
	{
		super(context);
		this.__HTTPResponse = HTTPResponse;
		this.Content = Content;
	}

	@java.lang.Override
	public IMendixObject executeAction() throws Exception
	{
		this.HTTPResponse = this.__HTTPResponse == null ? null : system.proxies.HttpResponse.initialize(getContext(), __HTTPResponse);

		// BEGIN USER CODE
		
		RESTResponseProvider rp = new RESTResponseProvider(this.context(), HTTPResponse.getMendixObject(),  200, this.Content, "OK");

		return rp.getResponse();
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "Create_200_OK";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
