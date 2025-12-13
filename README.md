# **Loot Central: Documento de Especificação Funcional (DEF)**

## **1\. Visão Geral do Projeto**

Nome do Produto: Loot Central  
Versão: 1.0 (Especificação Inicial)  
Data: 13 de Dezembro de 2025  
Objetivo: Criar um marketplace nichado de alto desempenho focado na compra e venda de produtos e serviços relacionados a games, cultura nerd e colecionáveis, incluindo contas de jogos, periféricos e itens raros.

## **2\. Definição de Papéis (Stakeholders)**

O sistema Loot Central será estruturado para atender a três perfis principais, cada um com um conjunto exclusivo de permissões e funcionalidades.

| Papel | Descrição | Permissões Chave |
| :---- | :---- | :---- |
| **Cliente (Comprador)** | Usuário primário focado na busca, comparação e aquisição de produtos. | Busca, Filtros, Carrinho, Checkout, Histórico de Pedidos. |
| **Vendedor (Seller)** | Usuário que publica, gerencia e vende seus produtos/serviços. Possui todas as permissões de Cliente. | Gestão de Inventário, Dashboard de Vendas, Comunicação com Clientes. |
| **Administrador (Admin)** | Usuário com acesso irrestrito, focado na moderação, segurança e saúde financeira do marketplace. | Aprovação de Vendedores, Auditoria, Relatórios de Sistema, Remoção de Conteúdo. |

## **3\. Escopo Funcional**

As funcionalidades estão divididas em três módulos principais, conforme as necessidades de cada papel.

### **3.1. Módulo Cliente (Experiência de Compra)**

Este módulo foca em tornar a descoberta de produtos e o processo de compra intuitivos e seguros.

| ID | Funcionalidade | Requisito Detalhado (User Story) |
| :---- | :---- | :---- |
| **C.01** | **Acesso ao Catálogo** | Como cliente, eu quero ter acesso à página de produtos para visualizar o inventário completo do marketplace. |
| **C.02** | **Autenticação** | Como cliente, eu quero poder me cadastrar e fazer login no site, para salvar meu histórico de pedidos e informações pessoais. |
| **C.03** | **Busca Avançada** | Como cliente, eu quero buscar um produto específico (por nome ou descrição) para encontrar rapidamente o que preciso. |
| **C.04** | **Filtro por Categoria** | Como cliente, eu quero poder filtrar os produtos por categoria (ex: Periféricos, Contas, Jogos) para refinar minha busca. |
| **C.05** | **Filtro por Preço** | Como cliente, eu quero poder filtrar os produtos por faixa de preço para encontrar itens que caibam no meu orçamento. |
| **C.06** | **Adicionar ao Carrinho** | Como cliente, eu quero poder adicionar um produto ao carrinho de compras para agrupá-lo antes do checkout. |
| **C.07** | **Remover do Carrinho** | Como cliente, eu quero poder remover um produto do carrinho para corrigir um erro ou desistir de uma compra. |
| **C.08** | **Ajuste de Quantidade** | Como cliente, eu quero poder ajustar a quantidade de um item no carrinho para gerenciar a minha compra antes do checkout. |
| **C.09** | **Visualização do Carrinho** | Como cliente, eu quero poder visualizar o carrinho de compras com o subtotal atualizado para conferir os itens selecionados. |
| **C.10** | **Processo de Checkout** | Como cliente, eu quero poder finalizar a compra, seguindo os passos de pagamento e envio. |
| **C.11** | **Comunicação com o Vendedor** | Como cliente, eu quero poder entrar em contato com o vendedor (via chat ou sistema de mensagens) para tirar dúvidas sobre o produto. |
| **C.12** | **Rastreamento de Pedido** | Como cliente, eu quero poder acompanhar o status do meu pedido (ex: Processando, Enviado, Entregue) para saber a situação da entrega. |

### **3.2. Módulo Vendedor (Gestão e Vendas)**

Este módulo foca na eficiência da gestão do inventário e das vendas por parte dos usuários cadastrados como Vendedores.

| ID | Funcionalidade | Requisito Detalhado (User Story) |
| :---- | :---- | :---- |
| **V.01** | **Duplo Papel** | Como vendedor, eu também posso ser cliente, permitindo-me comprar itens no marketplace. |
| **V.02** | **Dashboard Gerencial** | Como vendedor, eu quero que meu dashboard exiba métricas importantes (vendas totais, estoque baixo, perguntas pendentes), para tomar decisões sobre o meu negócio. |
| **V.03** | **Gestão de Frete** | Como vendedor, eu quero poder definir as opções de frete e custos de envio para meus produtos, para gerenciar a logística da venda. |
| **V.04** | **Cadastro de Produto** | Como vendedor, eu quero poder adicionar um novo produto (incluindo imagens, descrição e preço) ao meu inventário. |
| **V.05** | **Edição de Produto** | Como vendedor, eu quero poder editar um produto existente (ex: alterar preço ou descrição) para manter as informações atualizadas. |
| **V.06** | **Remoção de Produto** | Como vendedor, eu quero poder remover um produto do meu inventário quando ele estiver esgotado ou descontinuado. |
| **V.07** | **Notificações em Tempo Real** | Como vendedor, eu quero ser notificado imediatamente quando um cliente fizer uma pergunta ou um novo pedido for realizado, para responder e processar as vendas rapidamente. |
| **V.08** | **Histórico de Pedidos** | Como vendedor, eu quero poder visualizar e gerenciar o histórico dos meus pedidos (pagos, enviados, cancelados), para manter o controle e atualizar o status de envio. |

### **3.3. Módulo Administrador (Moderação e Sistema)**

Este módulo garante a saúde, segurança e conformidade do marketplace, dando ao Admin ferramentas de controle e análise.

| ID | Funcionalidade | Requisito Detalhado (User Story) |
| :---- | :---- | :---- |
| **A.01** | **Processo de Aprovação de Vendedores** | Como Administrador, eu quero que o cadastro de novos vendedores passe por um processo de aprovação manual ou automática, para garantir que apenas usuários verificados e confiáveis possam vender. |
| **A.02** | **Log de Atividades** | Como Administrador, eu quero ter acesso a um log de atividades críticas (ex: remoção de produto, suspensão de conta), para auditar o sistema e rastrear problemas de segurança ou má conduta. |
| **A.03** | **Relatórios de Desempenho** | Como Administrador, eu quero poder gerar relatórios de vendas e desempenho por categoria e por vendedor, para identificar tendências, produtos populares e áreas de melhoria. |
| **A.04** | **Gestão de Denúncias** | Como Administrador, eu quero poder visualizar e gerenciar as denúncias de produtos ou vendedores feitas por clientes, para manter a qualidade e segurança do marketplace. |
| **A.05** | **Remoção de Usuários** | Como Administrador, eu quero poder remover ou suspender um cliente ou vendedor do sistema em caso de violação das políticas. |
| **A.06** | **Remoção de Conteúdo** | Como Administrador, eu quero poder remover qualquer produto ou pedido do sistema, por motivos de segurança, fraude ou erro de catalogação. |

## **4\. Próximos Passos**

O próximo passo lógico é detalhar as **Interfaces de Usuário (UI)** para as funcionalidades críticas e as **Regras de Negócio** para o checkout e o processo de aprovação de vendedores.