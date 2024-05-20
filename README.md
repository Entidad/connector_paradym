# Introduction

Paradym is a workflow builder for developers that provides the actions, workflows and infrastructure you need to use verifiable credentials in your solution.

This Paradym connector enables the usage of most of the Paradym API resources described in API documentation https://api.paradym.id/docs/

# Development

## Maintenance

This module is maintained in this GitHub repository

## Dependencies

- CommunityCommons
- REST_Responses
- Encryption
- JSONPath

## Issues

Please report any issues with the Paradym connector on [GitHub](https://github.com/Entidad/connector_paradym/issues).

# Documentation

This module supports Paradym API v1

https://api.paradym.id/docs/

## Configuration

Set Constant MicroflowProcessWebhook to the Module.MicroflowName that will handle the processing of the Webhook WorkflowExecution Events

## Limitations

### General

- The API uses JSON:API 1.1 specification for requesting a list of entities. From this specification query parameters: filter[], sort are supported. Paradym also supports Cursor Pagination Profile for pagination with page[size], page[before] and page[after]. These filter options are not implemented in this connector.

### Workflows

- Action: AttributesJSON is currently not correctly saved on the entity
- Payload: For both Input & Actions the attributes and predicates are not fully imported in the presentationExchange and possibly also missing from credentialExchange