# Introduction

Paradym is a workflow builder for developers that provides the actions, workflows and infrastructure you need to use verifiable credentials in your solution.

This Paradym connector enables the usage of most of the Paradym API resources described in API documentation https://paradym.id/reference?full

# Development

The `connector_paradym` requires at least Mendix version [9.24.18](https://marketplace.mendix.com/link/studiopro/9.24.18).

## Maintenance

This module is maintained in this GitHub repository

## Dependencies

- [CommunityCommons](https://marketplace.mendix.com/link/component/170)
- [REST_Responses](https://marketplace.mendix.com/link/component/118687)
- [Encryption](https://marketplace.mendix.com/link/component/1011)
- [JSONPath](https://marketplace.mendix.com/link/component/107685)

## Issues

Please report any issues with the Paradym connector on [GitHub](https://github.com/Entidad/connector_paradym/issues).

# Documentation

This module supports [Paradym API v1](https://paradym.id/reference?full)

Note: Paradym offered two ways of managing your digital identity infrastructure:

- API and Dashboard: Use Paradym to issue and verify credentials (SD-JWT over OpenID4VC and DIDComm based)
- Workflow builder *Deprecated*: Build custom workflows to automate your back-end.

Since the Workflow builder has been deprecated this module will no longer enhance/develop features for the Workflow builder, instead, we are adding more support for the API endpoints exposed by Paradym.

## Configuration

Please start with the Paradym documentation to get familiar with concepts of digital wallets, the workflows, actions and executions.

1. Create an account with Paradym, obtain an API key
1. Download connector_paradym from the Mendix Marketplace (or import it manually) into Studio Pro
1. Connect the Administrator (module role) to a User role and add the Paradym Settings snippet on an overview accessible by the user setting up the Paradym connector
1. Set Constants
1. Add logic to create/edit/delete APISettings by using theA PISettingsHelper and open the APISettings_Edit (it's up to you to decide how to determine the _IDs)
1. Add logic to create Projects (optional, can also be done via the Paradym dashboard)
1. Run the application, sign in and go to the Paradym settings page
1. Create APISettings, enter your API key and start syncing data from Paradym (at this point there won't be much data, but if you are connection with an existing API key you can retrieve existing projects, workflows, mediators, etc.)
1. Start building with the components of connector_paradym (create workflows in Paradym, execute workflows, process the response from the webhooks)

To further test and work with Paradym workflows (and executions) it is recommended to use a gateway that can forward the webhook events to your local development machine (e.g. hookdeck, ngrok).

## Migration from v1 to v2 [!]

When upgrading the Connector_Paradym module in your project from version 1.x to version 2.x make sure to read and follow these steps. As it contains a few breaking changes

**Before importing** the v2 in your application:

1. Rename the entity `WebhookExecutionEvent` to `Event`. This will ensure that data will not be lost when importing and deploying v2

**During deployment** of your application containing the v2 module set these Constants:

1. `Connector_Paradym.MicroflowProcessWorkflowExecutionEvents` (this used to be `Connector_Paradym.MicroflowProcessWebhooks`)
1. `Connector_Paradym.MicroflowProcessEvents` (new)

**Runtime configuration** after your application has started

1. Update webhook endpoints for each project. Existing webhook endpoints no longer work. Delete the existing webhooks and create new webhooks using the following pattern `https://your-application-url.com/rest/paradym/event`

## Security

This module tries to follow the principle of least privilege, in which a user is given the minimum levels of access needed. 

- Module roles: Administrator role for configuring the Paradym connector and debugging information. No other users should have access to logic or data from this module.
- Encryption: always store sensitive and personal information encrypted (e.g. ApiKey, proof-presentations, messages).

## Limitations

### General

- The API uses JSON:API 1.1 specification for requesting a list of entities. From this specification query parameters: filter[], sort are supported. Paradym also supports Cursor Pagination Profile for pagination with page[size], page[before] and page[after]. These filter options are not implemented in this connector.

### Workflows

- Action: AttributesJSON is currently not correctly saved on the entity
- Payload: For both Input & Actions the attributes and predicates are not fully imported in the presentationExchange and possibly also missing from credentialExchange

# References
- [Farmworker Wallet OS](https://tac.openwallet.foundation/projects/fwos/) ecosystem. Although `connector_paradym` is not part of the Farmworker Wallet OS it is used in the reference projects to demonstrate how a Cloud Agent implementation with Mendix could be developed
- [Paradym default workflows](https://github.com/Entidad/paradym-default-workflows). The Paradym documentation contains some example workflows, this repository contains the workflows definitions used as starting point for Entidad projects implementing Paradym